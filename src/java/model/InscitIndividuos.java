/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author IrbeinTepes
 */
@Entity
@Table(name = "inscit_individuos")
@XmlRootElement
public class InscitIndividuos implements IEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ind_id")
    private Integer id;
    @Size(max = 60)
    @Column(name = "ind_nm")
    private String indNm;
    @Size(max = 60)
    @Column(name = "ind_alcunha")
    private String indAlcunha;
    @Size(max = 60)
    @Column(name = "ind_nm_mae")
    private String indNmMae;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ind_sexo")
    private boolean indSexo;
    @Size(max = 20)
    @Column(name = "ind_rg")
    private String indRg;
    @Size(max = 2)
    @Column(name = "ind_rguf")
    private String indRguf;
    @Size(max = 11)
    @Column(name = "ind_cpf")
    private String indCpf;
    @Column(name = "ind_dtnasc")
    @Temporal(TemporalType.DATE)
    private Date indDtnasc;
    @Size(max = 16)
    @Column(name = "ind_fone")
    private String indFone;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ind_altura")
    private Float indAltura;
    @Size(max = 60)
    @Column(name = "ind_tp_tatoo")
    private String indTpTatoo;
    @Size(max = 60)
    @Column(name = "ind_ds_tatoo")
    private String indDsTatoo;
    @Size(max = 60)
    @Column(name = "ind_tp_scar")
    private String indTpScar;
    @Size(max = 60)
    @Column(name = "ind_ds_scar")
    private String indDsScar;
    @Size(max = 100)
    @Column(name = "ind_obs")
    private String indObs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "log_id")
    private int logId;
    @Column(name = "log_nr")
    private Integer logNr;
    @Size(max = 100)
    @Column(name = "ind_complemento")
    private String indComplemento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ind_dt")
    @Temporal(TemporalType.DATE)
    private Date indDt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ind_resp")
    private String indResp;
    @JoinColumn(name = "indcabelo_id", referencedColumnName = "indcabelo_id")
    @ManyToOne(optional = false)
    private InscitIndividuosCabelo indcabeloId;
    @JoinColumn(name = "indcor_id", referencedColumnName = "indcor_id")
    @ManyToOne(optional = false)
    private InscitIndividuosCor indcorId;
    @JoinColumn(name = "indolhos_id", referencedColumnName = "indolhos_id")
    @ManyToOne(optional = false)
    private InscitIndividuosOlhos indolhosId;
    @OneToMany(mappedBy = "indId",cascade = CascadeType.ALL)
    private List<InscitFoto> inscitFotoCollection;
    
    public InscitIndividuos() {
    }

    public InscitIndividuos(Integer indId) {
        this.id = indId;
    }

    public InscitIndividuos(Integer indId, boolean indSexo, int logId, Date indDt, String indResp) {
        this.id = indId;
        this.indSexo = indSexo;
        this.logId = logId;
        this.indDt = indDt;
        this.indResp = indResp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer indId) {
        this.id = indId;
    }

    public String getIndNm() {
        return indNm;
    }

    public void setIndNm(String indNm) {
        this.indNm = indNm;
    }

    public String getIndAlcunha() {
        return indAlcunha;
    }

    public void setIndAlcunha(String indAlcunha) {
        this.indAlcunha = indAlcunha;
    }

    public String getIndNmMae() {
        return indNmMae;
    }

    public void setIndNmMae(String indNmMae) {
        this.indNmMae = indNmMae;
    }

    public boolean getIndSexo() {
        return indSexo;
    }

    public void setIndSexo(boolean indSexo) {
        this.indSexo = indSexo;
    }

    public String getIndRg() {
        return indRg;
    }

    public void setIndRg(String indRg) {
        this.indRg = indRg;
    }

    public String getIndRguf() {
        return indRguf;
    }

    public void setIndRguf(String indRguf) {
        this.indRguf = indRguf;
    }

    public String getIndCpf() {
        return indCpf;
    }

    public void setIndCpf(String indCpf) {
        this.indCpf = indCpf;
    }

    public Date getIndDtnasc() {
        return indDtnasc;
    }

    public void setIndDtnasc(Date indDtnasc) {
        this.indDtnasc = indDtnasc;
    }

    public String getIndFone() {
        return indFone;
    }

    public void setIndFone(String indFone) {
        this.indFone = indFone;
    }

    public Float getIndAltura() {
        return indAltura;
    }

    public void setIndAltura(Float indAltura) {
        this.indAltura = indAltura;
    }

    public String getIndTpTatoo() {
        return indTpTatoo;
    }

    public void setIndTpTatoo(String indTpTatoo) {
        this.indTpTatoo = indTpTatoo;
    }

    public String getIndDsTatoo() {
        return indDsTatoo;
    }

    public void setIndDsTatoo(String indDsTatoo) {
        this.indDsTatoo = indDsTatoo;
    }

    public String getIndTpScar() {
        return indTpScar;
    }

    public void setIndTpScar(String indTpScar) {
        this.indTpScar = indTpScar;
    }

    public String getIndDsScar() {
        return indDsScar;
    }

    public void setIndDsScar(String indDsScar) {
        this.indDsScar = indDsScar;
    }

    public String getIndObs() {
        return indObs;
    }

    public void setIndObs(String indObs) {
        this.indObs = indObs;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public Integer getLogNr() {
        return logNr;
    }

    public void setLogNr(Integer logNr) {
        this.logNr = logNr;
    }

    public String getIndComplemento() {
        return indComplemento;
    }

    public void setIndComplemento(String indComplemento) {
        this.indComplemento = indComplemento;
    }

    public Date getIndDt() {
        return indDt;
    }

    public void setIndDt(Date indDt) {
        this.indDt = indDt;
    }

    public String getIndResp() {
        return indResp;
    }

    public void setIndResp(String indResp) {
        this.indResp = indResp;
    }

    public InscitIndividuosCabelo getIndcabeloId() {
        return indcabeloId;
    }

    public void setIndcabeloId(InscitIndividuosCabelo indcabeloId) {
        this.indcabeloId = indcabeloId;
    }

    public InscitIndividuosCor getIndcorId() {
        return indcorId;
    }

    public void setIndcorId(InscitIndividuosCor indcorId) {
        this.indcorId = indcorId;
    }

    public InscitIndividuosOlhos getIndolhosId() {
        return indolhosId;
    }

    public void setIndolhosId(InscitIndividuosOlhos indolhosId) {
        this.indolhosId = indolhosId;
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
        if (!(object instanceof InscitIndividuos)) {
            return false;
        }
        InscitIndividuos other = (InscitIndividuos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.InscitIndividuos[ indId=" + id + " ]";
    }

    public List<InscitFoto> getInscitFotoCollection() {
        return inscitFotoCollection;
    }

    public void setInscitFotoCollection(List<InscitFoto> inscitFotoCollection) {
        this.inscitFotoCollection = inscitFotoCollection;
    }
    
}
