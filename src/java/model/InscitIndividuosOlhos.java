/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author IrbeinTepes
 */
@Entity
@Table(name = "inscit_individuos_olhos")
@XmlRootElement
public class InscitIndividuosOlhos implements IEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "indolhos_id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "indolhos_ds")
    private String indolhosDs;

    public InscitIndividuosOlhos() {
    }

    public InscitIndividuosOlhos(Integer indolhosId) {
        this.id = indolhosId;
    }

    public InscitIndividuosOlhos(Integer indolhosId, String indolhosDs) {
        this.id = indolhosId;
        this.indolhosDs = indolhosDs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer indolhosId) {
        this.id = indolhosId;
    }

    public String getIndolhosDs() {
        return indolhosDs;
    }

    public void setIndolhosDs(String indolhosDs) {
        this.indolhosDs = indolhosDs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InscitIndividuosOlhos)) {
            return false;
        }
        InscitIndividuosOlhos other = (InscitIndividuosOlhos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.InscitIndividuosOlhos[ indolhosId=" + id + " ]";
    }
    
}
