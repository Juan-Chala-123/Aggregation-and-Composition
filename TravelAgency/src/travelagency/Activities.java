/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelagency;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Activities {
    private String name;
    private int duration;
    
    public Activities() {
    }
    
    public Activities(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    
    // Getters y Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
}