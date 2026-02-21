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
public class Plan {

    private String name;
    private ArrayList<Routines> routines;

    public Plan(String name) {
        this.name = name;
        this.routines = new ArrayList<>();
    }

    public void addRoutine(Routines r) {
        routines.add(r);
    }

    public void removeRoutine(Routines r) {
        routines.remove(r);
    }

    public ArrayList<Routines> getRoutines() {
        return routines;
    }

    public String getName() {
        return name;
    }
}