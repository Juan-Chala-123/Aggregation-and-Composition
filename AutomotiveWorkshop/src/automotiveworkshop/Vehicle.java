/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotiveworkshop;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Vehicle {
    private String plate;
    private String color;
    private ServiceOrders order;
    private ArrayList<ServiceOrders> orders;
    
    public Vehicle(String plate, String color) {
        this.plate = plate;
        this.color = color;
        this.orders = new ArrayList<>();
    }
    
    public void addServiceOrders(LocalDate date, String description) {
        ServiceOrders order = new ServiceOrders(date, description);
        this.orders.add(order);
    }
    
    public String getPlate() {
        return this.plate;
    }
    
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public ArrayList<ServiceOrders> getOrders() {
        return this.orders;
    }
}