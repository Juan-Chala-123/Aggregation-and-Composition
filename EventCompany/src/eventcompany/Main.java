/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventcompany;

import java.time.*;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer customer = new Customer("Carlos Ramirez", 300123456, "carlos@email.com", "Av. Central 123");

        Event event = new Event( "Boda de Carlos", LocalDate.of(2026, 5, 20), "Salón Royal", customer );

        Supplier catering = new Supplier( "Delicias Catering", 5551111, "Comida");

        Supplier music = new Supplier( "DJ ProSound", 5552222, "Sonido" );

        event.addSupplier(catering);
        event.addSupplier(music);

        event.addActivity(LocalTime.of(18, 0), 120);
        event.addActivity(LocalTime.of(20, 30), 90);

        System.out.println("Evento: " + event.getName());
        System.out.println("Cliente: " + event.getCustomer().getName());
    }
    
}
