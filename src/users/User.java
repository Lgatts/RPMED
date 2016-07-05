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
    
    public String name;
    public String email;
    public String password;
    public String type;

    public User(String email, String name, String password, String type) {

        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
        
    }
}
