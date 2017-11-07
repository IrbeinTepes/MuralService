/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IrbeinTepes
 */
@Entity
@Table(name = "muralapp_ind_mural")
@XmlRootElement
public class MuralappIndMural implements IEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "indmural_id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "indmural_dataadd")
    private String indmuralDataadd;
    @Size(max = 45)
    @Column(name = "indmural_motivoadd")
    private String indmuralMotivoadd;
    @JoinColumn(name = "ind_id", referencedColumnName = "ind_id")
    @ManyToOne(optional = false)
    private InscitIndividuos indId;
    @JoinColumn(name = "usr_id", referencedColumnName = "usr_id")
    @ManyToOne(optional = false)
    private MuralappUsuario usrId;

    public MuralappIndMural() {
    }

    public MuralappIndMural(Integer indmuralId) {
        this.id = indmuralId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer indmuralId) {
        this.id = indmuralId;
    }

    public String getIndmuralDataadd() {
        return indmuralDataadd;
    }

    public void setIndmuralDataadd(String indmuralDataadd) {
        this.indmuralDataadd = indmuralDataadd;
    }

    public String getIndmuralMotivoadd() {
        return indmuralMotivoadd;
    }

    public void setIndmuralMotivoadd(String indmuralMotivoadd) {
        this.indmuralMotivoadd = indmuralMotivoadd;
    }

    public InscitIndividuos getIndId() {
        return indId;
    }

    public void setIndId(InscitIndividuos indId) {
        this.indId = indId;
    }

    public MuralappUsuario getUsrId() {
        return usrId;
    }

    public void setUsrId(MuralappUsuario usrId) {
        this.usrId = usrId;
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
        if (!(object instanceof MuralappIndMural)) {
            return false;
        }
        MuralappIndMural other = (MuralappIndMural) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MuralappIndMural[ indmuralId=" + id + " ]";
    }
    
}
