/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.util.ArrayList;
/**
 *
 * @author CHALA RAMIREZ
 */
public class Routines {

    private String name;
    private int duration;
    private ArrayList<Couches> couches;

    public Routines(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.couches = new ArrayList<>();
    }

    public void addCouche(Couches c) {
        couches.add(c);
    }

    public void removeCouche(Couches c) {
        couches.remove(c);
    }

    public ArrayList<Couches> getCouches() {
        return couches;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
}