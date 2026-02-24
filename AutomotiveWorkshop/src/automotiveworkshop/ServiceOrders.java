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
public class ServiceOrders {
    private LocalDate date;
    private String descriptionProblem;
    private ArrayList<Job> job;
    private ArrayList<Mechanic> mechanic;
    
    public ServiceOrders(LocalDate date, String descriptionProblem) {
        this.date = date;
        this.descriptionProblem = descriptionProblem;
        this.job = new ArrayList<>();
        this.mechanic = new ArrayList<>();
    }
    
    public void addJob(int cost, String description) {
        Job j = new Job(cost, description);
        this.job.add(j);
    }
    
    public void removeJob() {
        this.job = null;
    }
    
    public void addMechanic(Mechanic mechanic) {
        this.mechanic.add(mechanic);
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public String getDescriptionProblem() {
        return descriptionProblem;
    }
    
    public void setDescriptionProblem(String descriptionProblem) {
        this.descriptionProblem = descriptionProblem;
    }
    
    public ArrayList<Job> getJob() {
        return job;
    }
    
    public ArrayList<Mechanic> getMechanics() {
        return mechanic;
    }
}