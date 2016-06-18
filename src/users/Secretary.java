/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class Secretary {
    private String name;
    private String email;
    private String fone;
    private String cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String save() {
        try {
            URL doctorsDataURL = Doctors.class.getResource("/data/secretary.txt");

            FileWriter fw = new FileWriter(doctorsDataURL.getPath(), true); //Salvar arquivo, sem true subscreve save
            PrintWriter pw = new PrintWriter(fw); //Escreve conteudo na linha do arquivo

            pw.println(this.name);
            pw.println(this.email);
            pw.println(this.fone);
            pw.println(this.cpf);

            pw.flush(); //Enviar os dados do formulário e não salvar em um buffer
            pw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Doctors.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "Cadastrado com Sucesso!";
    }
    
}