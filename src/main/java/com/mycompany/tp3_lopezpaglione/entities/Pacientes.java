
package com.mycompany.tp3_lopezpaglione.entities;

 //@author Gonzalo Lopez Paglione

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;


 
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p"),
    @NamedQuery(name = "Pacientes.findById", query = "SELECT p FROM Pacientes p WHERE p.id = :id"),
    @NamedQuery(name = "Pacientes.findByApellido", query = "SELECT p FROM Pacientes p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Pacientes.findByNombre", query = "SELECT p FROM Pacientes p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Pacientes.findByFecha", query = "SELECT p FROM Pacientes p WHERE p.fecha = :fecha")})
public class Pacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 155)
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 155)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "id_medico", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Medicos idMedico;

    public Pacientes() {
    }

    public Pacientes(Integer id) {
        this.id = id;
    }

    public Pacientes(Integer id, String apellido, String nombre, Date fecha) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Medicos getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medicos idMedico) {
        this.idMedico = idMedico;
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
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.tp3_lopezpaglione.entities.Pacientes[ id=" + id + " ]";
    }

}
