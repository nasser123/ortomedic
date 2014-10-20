/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nasser
 */
@Entity
@Table(name = "consulta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c"),
    @NamedQuery(name = "Consulta.findByIdconsulta", query = "SELECT c FROM Consulta c WHERE c.idconsulta = :idconsulta"),
    @NamedQuery(name = "Consulta.findByDataConsulta", query = "SELECT c FROM Consulta c WHERE c.dataConsulta = :dataConsulta"),
    @NamedQuery(name = "Consulta.findByHoraConsulta", query = "SELECT c FROM Consulta c WHERE c.horaConsulta = :horaConsulta"),
    @NamedQuery(name = "Consulta.findByCompareceu", query = "SELECT c FROM Consulta c WHERE c.compareceu = :compareceu")})
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconsulta")
    private Integer idconsulta;
    @Column(name = "data_consulta")
    @Temporal(TemporalType.DATE)
    private Date dataConsulta;
    @Lob
    @Column(name = "sintomas")
    private String sintomas;
    @Lob
    @Column(name = "exames")
    private String exames;
    @Column(name = "hora_consulta")
    @Temporal(TemporalType.TIME)
    private Date horaConsulta;
    @Column(name = "compareceu")
    private Boolean compareceu;
    @Lob
    @Column(name = "receita")
    private String receita;
    @Lob
    @Column(name = "medicacao")
    private String medicacao;
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    @ManyToOne(optional = false)
    private Paciente idpaciente;
    @JoinColumn(name = "idtipo_consulta", referencedColumnName = "idtipo_consulta")
    @ManyToOne(optional = false)
    private TipoConsulta idtipoConsulta;

    public Consulta() {
    }

    public Consulta(Integer idconsulta) {
        this.idconsulta = idconsulta;
    }

    public Integer getIdconsulta() {
        return idconsulta;
    }

    public void setIdconsulta(Integer idconsulta) {
        this.idconsulta = idconsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames) {
        this.exames = exames;
    }

    public Date getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(Date horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public Boolean getCompareceu() {
        return compareceu;
    }

    public void setCompareceu(Boolean compareceu) {
        this.compareceu = compareceu;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public Paciente getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Paciente idpaciente) {
        this.idpaciente = idpaciente;
    }

    public TipoConsulta getIdtipoConsulta() {
        return idtipoConsulta;
    }

    public void setIdtipoConsulta(TipoConsulta idtipoConsulta) {
        this.idtipoConsulta = idtipoConsulta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconsulta != null ? idconsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.idconsulta == null && other.idconsulta != null) || (this.idconsulta != null && !this.idconsulta.equals(other.idconsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Consulta[ idconsulta=" + idconsulta + " ]";
    }
    
}
