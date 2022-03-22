/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

/**
 *
 *
 */
public class UIDoctorMenu {
    public static void showDoctorMenu(){
        int response = 0;
        do {            
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Wlcome" + UIMenu.doctorLooged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Schedule Appointments");
            System.out.println("0. Logout");
            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();
            switch (response) {
                case 1:
                    
                    break;
                    
                default:
                    throw new AssertionError();
            }
        } while (response != 0);
    }
    
    public static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do {            
            System.out.println();
            System.out.println("::Add Available Apopointments");
            System.out.println("::Select a Month");
            for (int i = 0; i < 3; i++) {
                int j = i+1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
                
            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            if (response > 0 && response < 4) {
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available: [dd/mm/yyyyy]");
                String date = sc.nextLine();
                
                System.out.println("Your date is: " + date +"\n1. Correct \n 2.Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if (responseDate == 2) continue;
                
                int responseTime = 0;
                String time = " ";
                do {                    
                    System.out.println("Insert the time available for date: " + date + "[16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: "+ time+"\n1. Correct \n2. Change Time");
                    responseTime = Integer.valueOf(sc.nextLine());
                } while (responseTime==2);
                
                UIMenu.doctorLooged.addAvailableAppointment(date, time);
                
            }else{
                showDoctorMenu();
            }
            
        } while (response != 0);
    }
    
    
    
    
}
