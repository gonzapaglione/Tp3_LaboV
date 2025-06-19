package com.mycompany.tp3_lopezpaglione.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named(value = "actividad2")
@RequestScoped
public class Act2Controller {

    private float peso;
    private float altura;
    private float imc;
    private String imcMensaje;

    public Act2Controller() {
    }

    public void calcularImc() {
        float aux = altura * altura;
        setImc(peso / aux);
        cfgMensaje();
    }

    public void cfgMensaje() {
        if (imc <= 18.5) {
            imcMensaje = "Bajo peso";
        } else if (imc > 18.5 && imc < 24.9) {
            imcMensaje = "Normal";
        } else if (imc >= 25 && imc < 29.9) {
            imcMensaje = "Sobrepeso";
        } else if (imc >= 30 && imc < 34.9) {
            imcMensaje = "Obesidad grado I";
        } else if (imc >= 35 && imc < 39.9) {
            imcMensaje = "Obesidad grado II";
        } else if (imc >= 40) {
            imcMensaje = "Obesidad grado III";
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getImcMensaje() {
        return imcMensaje;
    }

    public void setImcMensaje(String imcMensaje) {
        this.imcMensaje = imcMensaje;
    }
    

}
