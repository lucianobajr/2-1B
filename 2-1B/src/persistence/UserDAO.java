/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.ArrayList;
import pkg2.pkg1b.model.User.NormalUser;

/**
 *
 * @author Guilherme
 */
public class UserDAO {
    private static ArrayList<NormalUser> Users;

    public UserDAO(){
        Users = new ArrayList<>();
    }

    public void inserirCliente(NormalUser NewUser) {
        Users.add(NewUser);
    }
}
