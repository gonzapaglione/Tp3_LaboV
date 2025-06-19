package com.mycompany.tp3_lopezpaglione.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named(value = "medicoAct4")
@RequestScoped
public class MedicoController {

    private String nombre;
    private String apellido;
    private int idMedico;

    public MedicoController() {
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

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    

    
}
