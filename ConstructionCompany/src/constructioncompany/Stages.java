/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructioncompany;

import java.util.ArrayList;
import java.time.LocalTime;
/**
 *
 * @author CHALA RAMIREZ
 */
public class Stages {

    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
    private ArrayList<Activities> activities;

    public Stages(String name, LocalTime startTime, LocalTime endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activities = new ArrayList<>();
    }

    public Activities addActivities(String name, int duration) {
        Activities a = new Activities(name, duration);
        this.activities.add(a);
        return a;
    }

    public void removeActivities(Activities a) {
        activities.remove(a);
    }

    public ArrayList<Activities> getActivities() {
        return activities;
    }

    public String getName() {
        return name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}