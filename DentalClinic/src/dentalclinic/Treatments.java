/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dentalclinic;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Treatments {
    private LocalDate startDate;
    private String diagnosis;
    private String stimatedCost;
    private ArrayList<Sessions> sessions;

    public Treatments(LocalDate startDate, String diagnosis, String stimatedCost) {
        this.startDate = startDate;
        this.diagnosis = diagnosis;
        this.stimatedCost = stimatedCost;
    }
    
    public void addSession(LocalDate date, String procedurePerformend, ArrayList<Dentist> dentist) {
        Sessions sessions = new Sessions(date, procedurePerformend, dentist);
        this.sessions.add(sessions);
    }
    
    public void removeSession(Sessions s) {
        this.sessions.remove(s);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getStimatedCost() {
        return stimatedCost;
    }

    public void setStimatedCost(String stimatedCost) {
        this.stimatedCost = stimatedCost;
    }
}
