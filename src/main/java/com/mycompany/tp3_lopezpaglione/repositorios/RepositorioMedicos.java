package com.mycompany.tp3_lopezpaglione.repositorios;

import com.mycompany.tp3_lopezpaglione.entities.Medicos;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import java.util.Optional;

/**
 * @author gonza
 */
@Stateless
public class RepositorioMedicos {

    @Inject
    EntityManager em;

    public Optional<Medicos> porId(Integer id) {
        return Optional.ofNullable(em.find(Medicos.class, id));
    }

    public Medicos porNombre(String nom) {
        Query q = em.createQuery("SELECT M FROM medicos WHERE M.nombre LIKE : %nom1%", Medicos.class);
        q.setParameter("nom1", nom);
        q.setMaxResults(1);
        return (Medicos) q.getSingleResult();
    }
    
    public List<Medicos> listar(){
        return em.createQuery("SELECT M FROM medicos M",Medicos.class).getResultList();
    }
    

}
