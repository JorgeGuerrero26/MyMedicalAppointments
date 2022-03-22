/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package model;

import java.util.Date;
import ui.UIMenu;
/**
 *
 * @author Darklord
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Doctor doctor = new Doctor("Jorge","Macrobiologia");
        doctor.addAvailableAppointment("10/10/2022", "4am");
        doctor.addAvailableAppointment("10/10/2022", "10am");
        doctor.addAvailableAppointment("10/10/2022", "1pm");
        
        
        
        for ( Doctor.AvailableAppointment Aa : doctor.getAvailableAppointment()) {
            System.out.println(Aa.getDate() + " " + Aa.getTime() );
        }

        System.out.println(doctor);
        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        patient.setWeight(60.5); 
        patient.setHeight(1.6);
        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());
        System.out.println(patient);
        
        User user = new Doctor("Anahi", "Anahi@gmail.com");
        user.showDataUser();
        
        User user1 = new User("Anahi","Anahi@gmail.com"){
            @Override
            public void showDataUser(){
                System.out.println("Doctor");
                System.out.println("Departamento de Geriatria");
            }
        };
        
        user1.showDataUser();
        
 
        
    }
    
}
