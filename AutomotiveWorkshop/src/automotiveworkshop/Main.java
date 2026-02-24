/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotiveworkshop;

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
        Mechanic mechanic1 = new Mechanic("Carlos Ruiz", 1001);
        Mechanic mechanic2 = new Mechanic("Ana López", 1002);
        
        Workshop workshop = new Workshop("Taller Central", "555-1234");
        workshop.addMechanic(mechanic1);
        workshop.addMechanic(mechanic2);
        
        ServiceOrders order = new ServiceOrders(LocalDate.now(), "Problema con el motor");
        order.addJob(500, "Reparación de motor");
        order.addMechanic(mechanic1);
        
        Vehicle vehicle = new Vehicle("ABC-123", "Rojo");
        vehicle.addServiceOrders(LocalDate.now(), "Cambio de aceite");
        
        Owner owner = new Owner("Juan Pérez", 1);
        owner.addVehicles("XYZ-789", "Azul");
        owner.addVehicles("DEF-456", "Verde");
        
        System.out.println("=== SISTEMA DE TALLER ===\n");
        System.out.println("Taller: " + workshop.getName());
        System.out.println("Teléfono: " + workshop.getTelephone());
        System.out.println("\nMecánicos disponibles: " + workshop.getMechanics().size());
        
        System.out.println("\n=== ORDEN DE SERVICIO ===");
        System.out.println("Fecha: " + order.getDate());
        System.out.println("Problema: " + order.getDescriptionProblem());
        System.out.println("Trabajo - Costo: $" + order.getJob().getCost());
        System.out.println("Trabajo - Descripción: " + order.getJob().getDescription());
        
        System.out.println("\n=== VEHÍCULO ===");
        System.out.println("Placa: " + vehicle.getPlate());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Órdenes de servicio: " + vehicle.getOrders().size());
        
        System.out.println("\n=== PROPIETARIO ===");
        System.out.println("Nombre: " + owner.getName());
        System.out.println("ID: " + owner.getId());
        System.out.println("Vehículos registrados: " + owner.getVehicleList().size());
    }
    
}
