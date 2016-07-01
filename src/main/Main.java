/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import frames.Login;
import java.io.File;

/**
 *
 * @author Lucas
 */
public class Main {
    public static void main(String[] args) {
        
        if(new File(System.getenv("APPDATA") + "\\.RpMed").exists()){
            
        }
        else{
            new File(System.getenv("APPDATA") + "\\.RpMed").mkdir();
        }
        
        
        new Login().setVisible(true);
    }
}
