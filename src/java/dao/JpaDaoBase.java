package dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.Query;
import model.IEntity;

import persistence.JpaUtil;

public abstract class JpaDaoBase<T extends IEntity> implements Dao<T> {

//    protected EntityManager em;
    private final Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public JpaDaoBase() {
        this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        em = JpaUtil.getEntityManager();
    }

    @Override
    public void save(T t) {
        if (t.getId() != null) {
            JpaUtil.getEntityManager().merge(t);
        } else {
            JpaUtil.getEntityManager().persist(t);
        }
    }

    @Override
    public List<T> findAll() {
        Query query = JpaUtil.getEntityManager().createQuery(getQueryAll());
        return query.getResultList();
    }

    @Override
    public T findById(Long id) {
        return JpaUtil.getEntityManager().find(entityClass, id);
    }

    @Override
    public void remove(T t) {
        remove(t.getId());
    }

    @Override
    public void remove(Integer id) {
        JpaUtil.getEntityManager().remove(JpaUtil.getEntityManager().getReference(entityClass, id));
    } 

    @Override
    public List<T> findAllBetween(int start, int end) {
        Query query = JpaUtil.getEntityManager().createQuery(getQueryAll());
        query.setFirstResult(start);
        query.setMaxResults(end);
        return query.getResultList();
    }

    protected String getQueryAll() {
        return "select t from " + entityClass.getName() + " t ";
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }
    

}
