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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "muralapp_usuario_tipo")
@XmlRootElement
public class MuralappUsuarioTipo implements IEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_tipo_id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "usr_tipo_nome")
    private String usrTipoNome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usrTipoId")
    private Collection<MuralappUsuario> muralappUsuarioCollection;

    public MuralappUsuarioTipo() {
    }

    public MuralappUsuarioTipo(Integer usrTipoId) {
        this.id = usrTipoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer usrTipoId) {
        this.id = usrTipoId;
    }

    public String getUsrTipoNome() {
        return usrTipoNome;
    }

    public void setUsrTipoNome(String usrTipoNome) {
        this.usrTipoNome = usrTipoNome;
    }

    @XmlTransient
    public Collection<MuralappUsuario> getMuralappUsuarioCollection() {
        return muralappUsuarioCollection;
    }

    public void setMuralappUsuarioCollection(Collection<MuralappUsuario> muralappUsuarioCollection) {
        this.muralappUsuarioCollection = muralappUsuarioCollection;
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
        if (!(object instanceof MuralappUsuarioTipo)) {
            return false;
        }
        MuralappUsuarioTipo other = (MuralappUsuarioTipo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MuralappUsuarioTipo[ usrTipoId=" + id + " ]";
    }
    
}
