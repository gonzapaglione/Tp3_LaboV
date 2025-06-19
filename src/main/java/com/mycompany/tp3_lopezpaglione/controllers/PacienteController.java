package com.mycompany.tp3_lopezpaglione.controllers;

import com.mycompany.tp3_lopezpaglione.entities.Medicos;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named(value = "pacienteAct4")
@RequestScoped
public class PacienteController {

    private String nombre;
    private String apellido;
    private String turno;
    private Medicos medicoSeleccionado;

    private static PacienteController[] vector = new PacienteController[10];
    private static int indice = 0;

    public PacienteController() {
        this.nombre = "";
        this.apellido = "";
        this.turno = null;
    }

    public void inicializarVector() {
        for (int i = 0; i < 10; i++) {
            vector[i] = new PacienteController();
        }
    }

    public String registrarTurno() {
        vector[indice] = this;
        indice++;
        return "turnoConfirmado.xhtml";
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Medicos getMedicoSeleccionado() {
        return medicoSeleccionado;
    }

    public void setMedicoSeleccionado(Medicos medicoSeleccionado) {
        this.medicoSeleccionado = medicoSeleccionado;
    }
}
