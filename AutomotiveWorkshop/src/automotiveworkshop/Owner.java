/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotiveworkshop;

import java.util.ArrayList;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Owner {
    private String name;
    private int id;
    private ArrayList<Vehicle> vehicleList;
    
    public Owner(String name, int id) {
        this.name = name;
        this.id = id;
        this.vehicleList = new ArrayList<>();
    }
    
    public void addVehicles(String plate, String color) {
        Vehicle vehicle = new Vehicle(plate, color);
        this.vehicleList.add(vehicle);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }
}