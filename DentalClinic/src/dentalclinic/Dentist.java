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
    private String professionalCardNumber;

    public Dentist(String name, String specialty, String professionalCardNumber) {
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

    public String getProfessionalCardNumber() {
        return professionalCardNumber;
    }

    public void setProfessionalCardNumber(String professionalCardNumber) {
        this.professionalCardNumber = professionalCardNumber;
    }

}