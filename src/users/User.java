/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author Lucas
 */
public class User {

    public String id;
    public String name;
    public String email;
    public String password;
    public String type;

    public User(String id, String email, String name, String password, String type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;

    }
}
