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
public class Patient {
    private String name;
    private int documentNumber;
    private int telephone;
    private ArrayList<Treatments> treatments;

    public Patient(String name, int documentNumber, int telephone) {
        this.name = name;
        this.documentNumber = documentNumber;
        this.telephone = telephone;
    }
    
    public void addTreatments(LocalDate startDate, String diagnosis, String stimatedCost) {
        Treatments treatments = new Treatments(startDate, diagnosis, stimatedCost);
        this.treatments.add(treatments);
    }
    
    public void removeTreatments(Treatments t) {
        this.treatments.remove(t);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
