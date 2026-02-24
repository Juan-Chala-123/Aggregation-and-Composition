package privatesecuritycompany;

import java.time.LocalDate;
import java.util.ArrayList;

public class Service {
    private LocalDate startDate;
    private int duration;
    private ArrayList<Company> company;
    private ArrayList<Guard> guards;
    private ArrayList<Shifts> shifts;
    
    public Service(LocalDate startDate, int duration) {
        this.startDate = startDate;
        this.duration = duration;
        this.guards = new ArrayList<>();
        this.shifts = new ArrayList<>();
        this.company = new ArrayList<>();
    }
    
    public void addEmpresa(Company c) {
        this.company.add(c);
    }
    
    public void addGuards(Guard g) {
        this.guards.add(g);
    }
    
    public void addShifts(Shifts s) {
        this.shifts.add(s);
    }
    
    public void removeShifts(Shifts s) {
        this.shifts.remove(s);
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }
    
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public ArrayList<Company> getCompany() {
        return company;
    }
    
    public ArrayList<Guard> getGuards() {
        return guards;
    }
    
    public ArrayList<Shifts> getShifts() {
        return shifts;
    }
}
