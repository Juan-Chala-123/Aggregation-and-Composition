/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructioncompany;

import java.time.LocalTime;
import java.util.ArrayList;
/**
 *
 * @author CHALA RAMIREZ
 */
public class Project {

    private String name;
    private String location;
    private int budget;
    private ArrayList<Stages> stages;
    private ArrayList<Engineers> engineers;

    public Project(String name, String location, int budget) {
        this.name = name;
        this.location = location;
        this.budget = budget;
        this.stages = new ArrayList<>();
        this.engineers = new ArrayList<>();
    }

    public Stages addStages(String name, LocalTime startTime, LocalTime endTime) {
        Stages s = new Stages(name, startTime, endTime);
        this.stages.add(s);
        return s;
    }

    public void addEngineer(Engineers e) {
        engineers.add(e);
    }

    public ArrayList<Stages> getStages() {
        return stages;
    }

    public ArrayList<Engineers> getEngineers() {
        return engineers;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public int getBudget() {
        return this.budget;
    }
}