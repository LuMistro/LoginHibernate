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
    User user;
    UserDao userDao;
    Frame principal = new PrincipalTela();
    LoginTela loginTela;

    public LoginControl() {
        userDao = new UserDao();
        user = new User();
    }

    public void takeData() {
        login = LoginTela.tfLogin.getText();
        senha = LoginTela.tfPass.getText();
        user.setLogin(login);
        user.setPass(senha);
        System.out.println("login>>>" + login);
        System.out.println("pass>>>>" + senha);

    }

    public void cleanFields() {
        LoginTela.tfLogin.setText("");
        LoginTela.tfPass.setText("");
    }

    public boolean authenticate() {
        if (userDao.login(user.getLogin().toString(), user.getPass().toString()) == null) {
            cleanFields();
            loginTela.labelUserIncorreto.setVisible(true);
            return false;
        } else {
            return true;
        }
    }

    public void openFramePrincipal() {
        takeData();
        Boolean confere = authenticate();
        if (confere == true) {
            principal.setVisible(true);
            loginTela.dispose();
        }

    }

}
