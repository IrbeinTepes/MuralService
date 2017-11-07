/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.annotation.Annotation;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IrbeinTepes
 */
@Entity
@Table(name = "inscit_foto")
@XmlRootElement
public class InscitFoto implements IEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "foto_id")
    private Integer id; 
    @Lob
    @Size(max = 65535)
    @Column(name = "foto_arq")
    private String fotoArq;
    @Basic(optional = false)
    @NotNull
    @Column(name = "foto_dt")
    @Temporal(TemporalType.DATE)
    private Date fotoDt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "foto_resp")
    private String fotoResp;
    @JoinColumn(name = "ind_id", referencedColumnName = "ind_id")
    @ManyToOne
    private InscitIndividuos indId;

    public InscitFoto() {
    }

    public InscitFoto(Integer fotoId) {
        this.id = fotoId;
    }

    public InscitFoto(Integer fotoId, Date fotoDt, String fotoResp) {
        this.id = fotoId;
        this.fotoDt = fotoDt;
        this.fotoResp = fotoResp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer fotoId) {
        this.id = fotoId;
    }

    public String getFotoArq() {
        return fotoArq;
    }

    public void setFotoArq(String fotoArq) {
        this.fotoArq = fotoArq;
    }

    public Date getFotoDt() {
        return fotoDt;
    }

    public void setFotoDt(Date fotoDt) {
        this.fotoDt = fotoDt;
    }

    public String getFotoResp() {
        return fotoResp;
    }

    public void setFotoResp(String fotoResp) {
        this.fotoResp = fotoResp;
    }

    public InscitIndividuos getIndId() {
        return indId;
    }

    public void setIndId(InscitIndividuos indId) {
        this.indId = indId;
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
        if (!(object instanceof InscitFoto)) {
            return false;
        }
        InscitFoto other = (InscitFoto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.InscitFoto[ fotoId=" + id + " ]";
    }
    
}
