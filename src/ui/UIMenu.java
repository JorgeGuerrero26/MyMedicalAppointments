/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;
import model.Patient;

/**
 *
 * @author Darklord
 */
public class UIMenu {
    
    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLooged;
    public static Patient patientLogged;
    
    
    
    

     public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    authUser(2);
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }
     
     private static void authUser(int userType){
         ArrayList<Doctor> doctors = new ArrayList<>();
         doctors.add(new Doctor("Alejandro Martinez", "alejandra@gmail.com"));
         ArrayList<Patient> patients = new ArrayList<>();
         patients.add(new Patient("Anahí Salgado","anahi@gmail.com"));
         
         boolean emailCorrect = false;
         do {             
             System.out.println("Insert you email: ");
             Scanner sc = new Scanner(System.in);
             String email = sc.nextLine();
             if (userType == 1) {
                 for (Doctor d : doctors){
                     if (d.getEmail().equals(email)) {
                         emailCorrect = true;
                         doctorLooged =d;
                     }
                 }
             }
              if (userType == 2) {
                     for (Patient p : patients){
                     if (p.getEmail().equals(email)) {
                         emailCorrect = true;
                             patientLogged =p;
                     }
                 }
             }
             
         } while (!emailCorrect);
         
     }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}
