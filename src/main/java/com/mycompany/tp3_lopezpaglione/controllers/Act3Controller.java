package com.mycompany.tp3_lopezpaglione.controllers;

//@author Gonzalo Lopez Paglione
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named(value = "actividad3")
@RequestScoped
public class Act3Controller {

    private final double dolar = 1142.22;
    private double pesos;
    private double total;

    public Act3Controller() {
    }

    public void calcularTotal() {
        setTotal(pesos * dolar);
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double peso) {
        this.pesos = peso;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDolar() {
        return dolar;
    }

}
