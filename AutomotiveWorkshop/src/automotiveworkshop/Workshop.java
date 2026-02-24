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
public class Workshop {
    private String name;
    private String telephone;
    private ArrayList<Mechanic> mechanic;
    
    public Workshop(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
        this.mechanic = new ArrayList<>();
    }
    
    public void addMechanic(Mechanic m) {
        this.mechanic.add(m);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public ArrayList<Mechanic> getMechanics() {
        return mechanic;
    }
}