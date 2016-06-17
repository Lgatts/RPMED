/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Login {

    
    
    private static String typeTxt;
    private static String userNameTxt;
    

    public static String getUserNameTxt() {
        return userNameTxt;
    }           

    public static String getTypeTxt() {
        return typeTxt;
    }
    
    
    public static boolean verifyLogin(String userName, char[] passwordArray) {
        
        URL usersDataURL = Login.class.getResource("/data/users.txt"); //Criando url para o caminho do arquivo txt não influenciar
        
        String password = "", passwordTxt;
        
        try {

            BufferedReader usersData = new BufferedReader(new FileReader(usersDataURL.getPath()));//Abrindo Arquivo TXT

            do {

                userNameTxt = usersData.readLine();
                passwordTxt = usersData.readLine();
                typeTxt = usersData.readLine();

                if (userName.equals(userNameTxt)) { //Coparando o userName com o do Txt

                    for(int i = 0; i < passwordArray.length; i++){
                        password += passwordArray[i]; // transformando o arrya de char, para uma string;
                    }
                       
                    if (password.equals(passwordTxt)) { // O que ocorre caso nome e senha sejam válidos

                        return true;
                        
                    } else {// O que ocorre caso o nome seja válido mas a senha não
                        
                        JOptionPane.showMessageDialog(null,"Senha inválida" ,"Erro", JOptionPane.ERROR_MESSAGE);
                        
                        return false;
                        
                    }
                }

            } while (userNameTxt != null);
            
            JOptionPane.showMessageDialog(null,"Email não cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
            
            return false;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }

}
