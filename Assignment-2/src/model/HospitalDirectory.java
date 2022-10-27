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
public class HospitalDirectory {
    private static ArrayList<Hospital> listOfHospitals;  

    public HospitalDirectory() {
        listOfHospitals = new ArrayList<Hospital>();
    }

    public HospitalDirectory(ArrayList<Hospital> listOfHospitals) {
        this.listOfHospitals = listOfHospitals;
    }

    public static List<Hospital> getListOfHospitals() {
        return listOfHospitals;
    }

    public void setListOfHospitals(ArrayList<Hospital> listOfHospitals) {
        this.listOfHospitals = listOfHospitals;
    }
}