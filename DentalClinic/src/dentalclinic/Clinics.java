/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dentalclinic;

import java.util.*;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Clinics {
    private String name;
    private String address;
    private int telephone;
    private ArrayList<Dentist> dentist;

    public Clinics(String name, String address, int telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }
    
    public void addDentist(Dentist d) {
        this.dentist.add(d);
    }
    
    public void removeDentist(Dentist d) {
        this.dentist.remove(d);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}