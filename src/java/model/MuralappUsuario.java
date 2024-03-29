/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.annotations.Expose;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IrbeinTepes
 */

@Entity
@Table(name = "muralapp_usuario")
@XmlRootElement
public class MuralappUsuario implements IEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "usr_login")
    private String usrLogin;
    @Size(max = 45)
    @Column(name = "usr_senha")
    private String usrSenha;
    @JoinColumn(name = "usr_tipo_id", referencedColumnName = "usr_tipo_id")
    @ManyToOne(optional = false)
    private MuralappUsuarioTipo usrTipoId;

    public MuralappUsuario() {
    }

    public MuralappUsuario(Integer usrId) {
        this.id = usrId;
    }

    public MuralappUsuario(String usrLogin, String usrSenha) {
        this.usrLogin = usrLogin;
        this.usrSenha = usrSenha;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer usrId) {
        this.id = usrId;
    }

    public String getUsrLogin() {
        return usrLogin;
    }

    public void setUsrLogin(String usrLogin) {
        this.usrLogin = usrLogin;
    }

    public String getUsrSenha() {
        return usrSenha;
    }

    public void setUsrSenha(String usrSenha) {
        this.usrSenha = usrSenha;
    }

    public MuralappUsuarioTipo getUsrTipoId() {
        return usrTipoId;
    }

    public void setUsrTipoId(MuralappUsuarioTipo usrTipoId) {
        this.usrTipoId = usrTipoId;
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
        if (!(object instanceof MuralappUsuario)) {
            return false;
        }
        MuralappUsuario other = (MuralappUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MuralappUsuario[ usrId=" + id + " ]";
    }
    
}
