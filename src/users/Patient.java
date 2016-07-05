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
public class Patient {

    public String id;
    public String name;
    public String rg;
    public String cpf;
    public String fone;
    public String email;
    public String adress;
    public String adressNumber;

    public Patient(String id, String name, String rg, String cpf, String fone, String email, String adress, String adressNumber) {
        this.id = id;
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.fone = fone;
        this.email = email;
        this.adress = adress;
        this.adressNumber = adressNumber;
    }

}
