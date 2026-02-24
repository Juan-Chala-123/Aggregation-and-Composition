/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package privatesecuritycompany;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Company company1 = new Company("Seguridad Pro S.A.", 524567, "contacto@securitypro.com");
        
        Guard guard1 = new Guard("Juan Martínez", 76543, "G001");
        Guard guard2 = new Guard("María Johnson", 56544, "G002");
        Guard guard3 = new Guard("Carlos Davis", 55545, "G003");
        
        Shifts shift1 = new Shifts(LocalTime.of(6, 0), LocalTime.of(14, 0), "T001");
        Shifts shift2 = new Shifts(LocalTime.of(14, 0), LocalTime.of(22, 0), "T002");
        Shifts shift3 = new Shifts(LocalTime.of(22, 0), LocalTime.of(6, 0), "T003");
        
        Service service = new Service(LocalDate.of(2026, 2, 24), 8);
        
        service.addEmpresa(company1);
        
        service.addGuards(guard1);
        service.addGuards(guard2);
        service.addGuards(guard3);
        
        service.addShifts(shift1);
        service.addShifts(shift2);
        service.addShifts(shift3);
        
        System.out.println("=== SISTEMA DE SERVICIOS DE SEGURIDAD ===\n");
        
        System.out.println("Detalles del Servicio:");
        System.out.println("Fecha de Inicio: " + service.getStartDate());
        System.out.println("Duración: " + service.getDuration() + " horas");
        
        System.out.println("\nGuardias Asignados (" + service.getGuards().size() + "):");
        for (Guard guard : service.getGuards()) {
            System.out.println("  - " + guard.getName() + " (Código: " + guard.getCode() + 
                             ", Tel: " + guard.getTelephone() + ")");
        }
        
        System.out.println("\nTurnos Programados (" + service.getShifts().size() + "):");
        for (Shifts shift : service.getShifts()) {
            System.out.println("  - Turno " + shift.getCode() + ": " + 
                             shift.getStartTime() + " - " + shift.getEndTime());
        }
        
        System.out.println("\n=== ELIMINANDO TURNO ===");
        service.removeShifts(shift3);
        System.out.println("Turnos restantes: " + service.getShifts().size());
        
        System.out.println("\n=== SEGUNDO SERVICIO ===");
        Service service2 = new Service(LocalDate.of(2026, 2, 25), 12);
        service2.addEmpresa(company1);
        service2.addGuards(guard1);
        service2.addShifts(new Shifts(LocalTime.of(8, 0), LocalTime.of(20, 0), "T004"));
        
        System.out.println("Servicio 2 - Fecha de Inicio: " + service2.getStartDate());
        System.out.println("Servicio 2 - Duración: " + service2.getDuration() + " horas");
        System.out.println("Servicio 2 - Guardias: " + service2.getGuards().size());
        System.out.println("Servicio 2 - Turnos: " + service2.getShifts().size());
    }
    
}
