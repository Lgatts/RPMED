/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import frames.ViewDoctors;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Lucas
 */
public class Functions {
    
    
    
    public static void createListModel(URL urlGeneral,javax.swing.JList<String> jList){
    
    try {                        
            BufferedReader br = new BufferedReader(new FileReader(urlGeneral.getPath()));
            String strLine;
            DefaultListModel listModel = new DefaultListModel();

            while ((strLine = br.readLine()) != null) {
                listModel.addElement(strLine);                
            }            
            br.close();
            jList.setModel(listModel);
            

        } catch (IOException ex) {
            Logger.getLogger(ViewDoctors.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
}
