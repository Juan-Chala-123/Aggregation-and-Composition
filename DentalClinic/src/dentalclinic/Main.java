/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dentalclinic;

import java.time.LocalDate;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dentist dentist1 = new Dentist("Dr. Juan Pérez", "Ortodoncia", "DENT-98765");
        Clinics clinic = new Clinics("Smile Dental Clinic", "123 Main Street", 5551234);
        clinic.addDentist(dentist1);

        Patient patient = new Patient("Carlos López", 12345678, 300123456);

        Treatments treatment = new Treatments(LocalDate.now(), "Maloclusión dental", "1500 USD");

        // Sessions session = new Sessions(LocalDate.now(), "Ajuste de brackets");

        // session.addDentist(dentist1);

        treatment.addSession(LocalDate.now(), "Ajuste de brackets");
        patient.addTreatments(treatment);

        System.out.println("Paciente: " + patient.getName());
        System.out.println("Tratamiento: " + treatment.getDiagnosis());
        System.out.println("Dentista: " + dentist1.getName());
        System.out.println("Clínica: " + clinic.getName());
    } 
}