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

public class Consult {

    public String id;
    public String date;    
    public String startHour;
    public String finishHour;
    public String namePatient;
    public String nameMedic;

    public Consult(String id, String date, String startHour, String finishHour, String namePatient, String nameMedic) {
        this.id = id;
        this.date = date;
        this.startHour = startHour;
        this.finishHour = finishHour;
        this.namePatient = namePatient;
        this.nameMedic = nameMedic;
    }
    
}
