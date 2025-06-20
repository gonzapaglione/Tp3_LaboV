package com.mycompany.tp3_lopezpaglione.controllers;

import com.mycompany.tp3_lopezpaglione.entities.Medicos;
import com.mycompany.tp3_lopezpaglione.repositorios.RepositorioMedicos;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named(value = "medicoAct4")
@RequestScoped
public class MedicoController {

    private String nombre;
    private String apellido;
    private int idMedico;

    @Inject
    RepositorioMedicos repositorioM;
    
    public MedicoController() {
    }

    public List<Medicos> listaMedicos(){
        return repositorioM.listar();
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
