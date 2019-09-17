/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.strixteam.strixdesktop.dao;

import br.com.strixteam.strixdesktop.model.User;
import javax.persistence.EntityManager;

/**
 *
 * @author Luiza Mistro
 */
public class UserDao extends GenericDao<User, Integer> {

    EntityManager entityManager = new Conexao().getConnection();

    public Object login(String login, String pass) {
        try {
            Object usuario = entityManager
                    .createQuery("select u from User u where login = :login and pass = :senha")
                    .setParameter("login", login).setParameter("senha", pass).getResultList();

            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }
}
