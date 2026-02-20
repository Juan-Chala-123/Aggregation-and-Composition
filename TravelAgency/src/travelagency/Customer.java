/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelagency;

import java.util.*;
/**
 *
 * @author CHALA RAMIREZ
 */
public class Customer {
    private String name;
    private String telephone; // Cambiado a String para manejar formatos
    private String email;
    private ArrayList<Travel> travels; // CORRECCIÓN: Un cliente puede tener múltiples viajes
    
    public Customer() {
        this.travels = new ArrayList<>();
    }
    
    public Customer(String name, String telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.travels = new ArrayList<>();
    }
    
    public void addTravel(Travel travel) {
        this.travels.add(travel);
    }
    
    public void removeTravel(Travel travel) {
        this.travels.remove(travel);
    }
    
    // Getters y Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public ArrayList<Travel> getTravels() {
        return travels;
    }
    
    public void setTravels(ArrayList<Travel> travels) {
        this.travels = travels;
    }
}