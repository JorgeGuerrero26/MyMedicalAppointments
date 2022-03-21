/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package mymedicalappointments;

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
        doctor.addAvailableAppointment(new Date(), "4am");
        doctor.addAvailableAppointment(new Date(), "10am");
        doctor.addAvailableAppointment(new Date(), "1pm");
        
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
        
        
    }
    
}
