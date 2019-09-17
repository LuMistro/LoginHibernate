package br.com.strixteam.strixdesktop.control;

import br.com.strixteam.strixdesktop.dao.UserDao;
import br.com.strixteam.strixdesktop.model.User;
import br.com.strixteam.strixdesktop.view.LoginTela;
import br.com.strixteam.strixdesktop.view.PrincipalTela;
import java.awt.Frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luiza Mistro
 */
public class LoginControl {

    String login;
    String senha;
    User user = new User();
    UserDao userDao;
    Frame principal = new PrincipalTela();

    public LoginControl() {
        userDao = new UserDao();
    }

    public void takeData() {
        login = LoginTela.tfLogin.getText();
        senha = LoginTela.tfPass.getText();
        user.setLogin(login);
        user.setPass(senha);

    }

    public boolean authenticate() {
        if (userDao.login(user.getLogin(), user.getPass()) == null) {
            return false;
        } else {
            return true;
        }

    }

    public void openFramePrincipal() {
        if (authenticate()) {
            principal.setVisible(true);
        }

    }

}
