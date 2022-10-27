package model;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sindhura Bandaru
 */
public class DoctorDirectory {
    private List<Doctor> listOfDoctors;

    public DoctorDirectory() {
        listOfDoctors = new ArrayList<Doctor>();
    }

    public DoctorDirectory(List<Doctor> listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }

    public List<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }

    public void setListOfDoctors(List<Doctor> listOfDoctors) {
        this.listOfDoctors = listOfDoctors;
    }
    
}
