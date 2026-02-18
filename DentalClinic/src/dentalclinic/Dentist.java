/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dentalclinic;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Dentist {
    private String name;
    private String specialty;
    private int professionalCardNumber;

    public Dentist(String name, String specialty, int professionalCardNumber) {
        this.name = name;
        this.specialty = specialty;
        this.professionalCardNumber = professionalCardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getProfessionalCardNumber() {
        return professionalCardNumber;
    }

    public void setProfessionalCardNumber(int professionalCardNumber) {
        this.professionalCardNumber = professionalCardNumber;
    }

}