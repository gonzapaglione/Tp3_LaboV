package com.mycompany.tp3_lopezpaglione.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Named(value = "actividad1")
@RequestScoped
public class Act1Controller {

    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    public Act1Controller() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /*
    Aqui tuve un problema y es que jsf usa Date y no LocalDate, entonces busque en internet como convertir un Date a LocalDate.
    Referencia: https://stackoverflow.com/questions/21242110/convert-java-util-date-to-java-time-localdate
    */
    public LocalDate dateToLocalDate(Date fecha) {
        return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public String irAMostrar() {
        return "mostrar.xhtml";
    }

    public int getEdad() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNac2 = dateToLocalDate(fechaNacimiento);
        Period periodo = Period.between(fechaNac2, fechaActual);
        return periodo.getYears();
    }

}
