/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelagency;

import java.util.*;
import java.time.LocalDate;
/**
 *
 * @author CHALA RAMIREZ
 */
public class Travel {
    private LocalDate date;
    private String destination;
    private int cost;
    private ArrayList<Reservations> reservations;
    private ArrayList<Activities> activities;
    
    public Travel() {
        this.reservations = new ArrayList<>();
        this.activities = new ArrayList<>();
    }
    
    public Travel(LocalDate date, String destination, int cost) {
        this.date = date;
        this.destination = destination;
        this.cost = cost;
        this.reservations = new ArrayList<>();
        this.activities = new ArrayList<>();
    }
    
    public void addReservations(Reservations r) {
        this.reservations.add(r);
    }
    
    public void removeReservations(Reservations r) {
        this.reservations.remove(r);
    }
    
    public void addActivities(Activities a) {
        this.activities.add(a);
    }
    
    public void removeActivities(Activities a) {
        this.activities.remove(a);
    }
    
    // Getters y Setters
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public int getCost() {
        return cost;
    }
    
    public void setCost(int cost) {
        this.cost = cost;
    }
    
    public ArrayList<Reservations> getReservations() {
        return reservations;
    }
    
    public void setReservations(ArrayList<Reservations> reservations) {
        this.reservations = reservations;
    }
    
    public ArrayList<Activities> getActivities() {
        return activities;
    }
    
    public void setActivities(ArrayList<Activities> activities) {
        this.activities = activities;
    }
}