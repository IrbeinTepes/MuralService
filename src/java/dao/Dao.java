package dao;

import java.util.List;

public interface Dao<T> {

    void save(T t);
    List<T> findAll();
    T findById(Long id);
    void remove(T t);
    void remove(Integer id);
    List<T> findAllBetween(int start, int end);
    
}
