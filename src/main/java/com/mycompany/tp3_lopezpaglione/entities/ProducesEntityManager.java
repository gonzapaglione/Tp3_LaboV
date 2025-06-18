/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_lopezpaglione.entities;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author lesca
 */
@RequestScoped
public class ProducesEntityManager {
    @PersistenceContext(name="com.programacion1_EjemploJEE_war_1.0PU")
    private EntityManager em;
    
    @Produces
    @RequestScoped
    public EntityManager beanEntityManager(){
        return em;
    }
}
