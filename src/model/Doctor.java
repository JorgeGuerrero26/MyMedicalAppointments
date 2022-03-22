/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Darklord
 */
public class Doctor extends User {

    private String speciality;

    public Doctor(String name, String email) {
        super(name, email);

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName() {
        System.out.println(super.getName());
    }

    ArrayList<AvailableAppointment> availableappointment = new ArrayList<>();

    public void addAvailableAppointment(String date, String time) {
        availableappointment.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment() {
        return availableappointment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality" + speciality + "\nAvailbale" + availableappointment.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }

    public static class AvailableAppointment {

        private int id_acailableaapointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (Exception e) {
                
            }

            this.time = time;
        }

        public int getId_acailableaapointment() {
            return id_acailableaapointment;
        }

        public void setId_acailableaapointment(int id_acailableaapointment) {
            this.id_acailableaapointment = id_acailableaapointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\ntime: " + time;
        }

    }
}
