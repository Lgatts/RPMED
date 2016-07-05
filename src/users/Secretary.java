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
public class Secretary {
    public String id;
    public String email;
    public String name;
    public String fone;
    public String cpf;

    public Secretary(String id, String email, String name, String fone, String cpf) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.fone = fone;
        this.cpf = cpf;
    }
}