/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventcompany;

/**
 *
 * @author CHALA RAMIREZ
 */
import java.time.*;
import java.util.ArrayList;

public class Event {

    private String name;
    private LocalDate date;
    private String place;
    private Customer customer;
    private ArrayList<Supplier> suppliers;
    private ArrayList<Activity> activities;

    public Event(String name, LocalDate date, String place, Customer customer) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.customer = customer;
        this.suppliers = new ArrayList<>();
        this.activities = new ArrayList<>();
    }

    public void addSupplier(Supplier s) {
        suppliers.add(s);
    }

    public void removeSupplier(Supplier s) {
        suppliers.remove(s);
    }

    public void addActivity(LocalTime startTime, int duration) {
        Activity activity = new Activity(startTime, duration);
        activities.add(activity);
    }

    public void removeActivity(Activity a) {
        activities.remove(a);
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getName() {
        return name;
    }
}