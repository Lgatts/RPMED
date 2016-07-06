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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import static process.Functions.VerifyFile;
import users.Consult;
import users.Doctor;
import users.Patient;
import users.Secretary;
import users.User;

/**
 *
 * @author Lucas
 */
public class DisplayList {

    private List<User> users = new ArrayList<User>();
    private List<Doctor> doctors = new ArrayList<Doctor>();
    private List<Secretary> secretaries = new ArrayList<Secretary>();
    private List<Patient> patients = new ArrayList<Patient>();
    private List<Consult> consults = new ArrayList<Consult>();

    public List<Consult> getConsults() {
        return consults;
    }
    
    private String typeUser;

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Secretary> getSecretaries() {
        return secretaries;
    }

    public List<Patient> getPatients() {
        return patients;
    }    

    public List<User> getUsers() {
        return users;
    }

    public void createElement(String fileName) {

        String filePath = VerifyFile(fileName, false);

        if (filePath != null) {

            try {
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                String srt;

                switch (fileName) {
                    case "users.txt":
                        typeUser = "user";
                        String filePathAdmin = VerifyFile("admins.txt", false);

                        if (filePathAdmin != null) {
                            BufferedReader brAdmin = new BufferedReader(new FileReader(filePathAdmin));
                            while ((srt = brAdmin.readLine()) != null) {
                                User user = new User(srt, brAdmin.readLine(), brAdmin.readLine(), brAdmin.readLine(), brAdmin.readLine());
                                users.add(user);
                            }
                        }

                        while ((srt = br.readLine()) != null) {
                            User user = new User(srt, br.readLine(), br.readLine(), br.readLine(), br.readLine());
                            users.add(user);
                        }
                        break;
                    case "doctors.txt":
                        typeUser = "doctor";
                        while ((srt = br.readLine()) != null) {
                            Doctor doctor = new Doctor(srt, br.readLine(), br.readLine(), br.readLine(), br.readLine());
                            doctors.add(doctor);
                        }
                        break;
                    case "secretaries.txt":
                        typeUser = "secretary";
                        while ((srt = br.readLine()) != null) {
                            Secretary secretary = new Secretary(srt, br.readLine(), br.readLine(), br.readLine(), br.readLine());
                            secretaries.add(secretary);
                        }
                        break;
                    case "patients.txt":
                        typeUser = "patient";
                        while ((srt = br.readLine()) != null) {
                            Patient patient = new Patient(srt, br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.readLine());
                            patients.add(patient);
                        }
                        break;
                    case"consultation.txt":
                        typeUser = "consult";
                        while ((srt = br.readLine()) != null) {
                            Consult consult = new Consult(srt, br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.readLine());
                            consults.add(consult);
                        }
                        break;

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void createListModel(javax.swing.JList<String> jList) {

        DefaultListModel listModel = new DefaultListModel();

        switch (typeUser) {
            case "user":
                for (User user : users) {
                    listModel.addElement(user.name);
                }
                break;
            case "doctor":
                for (Doctor doctor : doctors) {
                    listModel.addElement(doctor.name);
                }
                break;
            case "secretary":
                for (Secretary secretary : secretaries) {
                    listModel.addElement(secretary.name);
                }
                break;
            case "patient":
                for (Patient patient : patients) {
                    listModel.addElement(patient.name);
                }
                break;
            case "consult":
                for (Consult consult : consults) {
                    listModel.addElement(consult.id);
                }
                break;
                
        }

        jList.setModel(listModel);

    }
    
    public void createCombotModel(javax.swing.JComboBox jList) {

        
        
        switch (typeUser) {
            case "user":
                for (User user : users) {
                    jList.addItem(user.name);
                }
                break;
            case "doctor":
                for (Doctor doctor : doctors) {
                    jList.addItem(doctor.name);
                }
                break;
            case "secretary":
                for (Secretary secretary : secretaries) {
                    jList.addItem(secretary.name);
                }
                break;
            case "patient":
                for (Patient patient : patients) {
                    jList.addItem(patient.name);
                }
                break;
            case "consult":
                for (Consult consult : consults) {
                    jList.addItem(consult.id);
                }
                break;
                
        }

        

    }
    

    public void clearList() {
        users.clear();
        doctors.clear();
        secretaries.clear();
        patients.clear();
    }

}
