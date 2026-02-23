/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dentalclinic;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Sessions {
    private LocalDate date;
    private String procedurePerformend;
    private ArrayList<Dentist> dentist;

    public Sessions(LocalDate date, String procedurePerformend) {
        this.date = date;
        this.procedurePerformend = procedurePerformend;
        this.dentist = new ArrayList<>();
    }
    
    public void addDentist(Dentist d) {
        this.dentist.add(d);
    }
    
    public void eliminarDentista(Dentist d) {
        this.dentist.remove(d);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getProcedurePerformend() {
        return procedurePerformend;
    }

    public void setProcedurePerformend(String procedurePerformend) {
        this.procedurePerformend = procedurePerformend;
    }    
}
