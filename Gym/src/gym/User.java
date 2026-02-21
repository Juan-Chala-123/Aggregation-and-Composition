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
public class User {

    private String name;
    private int telephone;
    private ArrayList<Plan> plans;

    public User(String name, int telephone) {
        this.name = name;
        this.telephone = telephone;
        this.plans = new ArrayList<>();
    }

    public void addPlan(Plan p) {
        plans.add(p);
    }

    public void removePlan(Plan p) {
        plans.remove(p);
    }

    public ArrayList<Plan> getPlans() {
        return plans;
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }
}
