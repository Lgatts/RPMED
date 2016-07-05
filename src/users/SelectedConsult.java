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
public class SelectedConsult {
    private static int index = -1;
    private static Consult consult = new Consult(null,null,null,null,null,null);

    public static Consult getConsult() {
        return consult;
    }

    public static void setConsult(Consult consult) {
        SelectedConsult.consult = consult;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        SelectedConsult.index = index;
    }
    
    
    
    
}
