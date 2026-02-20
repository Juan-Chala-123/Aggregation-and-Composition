/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelagency;

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
        Reservations hotel1 = new Reservations("Hotel Playa Dorada", "Zona Hotelera", "República Dominicana");
        Reservations hotel2 = new Reservations("Grand Resort", "Cancún", "México");
        
        Activities actividad1 = new Activities("Snorkeling", 120);
        Activities actividad2 = new Activities("Tour por la ciudad", 180);
        Activities actividad3 = new Activities("Cena romántica", 90);
        
        Travel viaje1 = new Travel(LocalDate.of(2024, 7, 15), "Caribe", 1500);
        
        viaje1.addReservations(hotel1);
        
        viaje1.addActivities(actividad1);
        viaje1.addActivities(actividad2);
        viaje1.addActivities(actividad3);
        
        Customer cliente1 = new Customer("Juan Pérez", "+1-809-555-1234", "juan.perez@email.com");
        
        cliente1.addTravel(viaje1);
        
        System.out.println("Cliente: " + cliente1.getName());
        System.out.println("Viaje \nDestino: " + viaje1.getDestination()+ "\nFecha: " + viaje1.getDate() + "\nCosto: " + viaje1.getCost());
        System.out.println("Actividades: " + viaje1.getActivities() + "\nReservaciones: " + viaje1.getReservations());
    }
    
}
