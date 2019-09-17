/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

import br.com.strixteam.strixdesktop.dao.UserDao;
import br.com.strixteam.strixdesktop.model.User;
import javax.persistence.Persistence;

/**
 *
 * @author Luiza Mistro
 */
public class Exemplos {

    public static void main(String[] args) {
//    User u = new User();
//    u.setLogin("1234");
//    u.setPass("1234");
//    u.setAccess(1);
        UserDao dao = new UserDao();
//    dao.salvar(u);
        System.out.println(dao.login("1234", "1234"));

//        Persistence.createEntityManagerFactory("StrixDesktop-PU");
    }
}
