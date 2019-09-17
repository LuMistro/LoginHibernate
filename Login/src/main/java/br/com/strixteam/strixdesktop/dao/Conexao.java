/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.strixteam.strixdesktop.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luiza Mistro
 */
public class Conexao {

    public EntityManager getConnection() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("StrixDesktop-PU");
        EntityManager entityManager = factory.createEntityManager();
        return entityManager;
    }

}
