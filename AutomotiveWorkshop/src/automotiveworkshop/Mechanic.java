/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotiveworkshop;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Mechanic {
    private String name;
    private int numId;
    
    public Mechanic(String name, int numId) {
        this.name = name;
        this.numId = numId;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumId() {
        return numId;
    }
    
    public void setNumId(int numId) {
        this.numId = numId;
    }
}