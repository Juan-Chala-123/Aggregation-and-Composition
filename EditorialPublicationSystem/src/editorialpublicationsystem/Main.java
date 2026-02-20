/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editorialpublicationsystem;

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
        Chapters cap1 = new Chapters("Introducción", 15);
        Chapters cap2 = new Chapters("Desarrollo", 30);
        Chapters cap3 = new Chapters("Conclusión", 10);
        
        Books libro1 = new Books("Aprendiendo Java", "978-3-16-148410-0", LocalDate.of(2024, 1, 15));
        
        libro1.addChapters(cap1);
        libro1.addChapters(cap2);
        libro1.addChapters(cap3);
        
        Authors autor1 = new Authors("Juan Pérez");
        Authors autor2 = new Authors("María García");
        
        System.out.println("Libro: " + libro1.getTitle());
        System.out.println("ISBN: " + libro1.getISBN());
        System.out.println("Fecha de publicación: " + libro1.getPublicationDate());
        System.out.println("Número de capítulos: " + libro1.getChapters().size());
        System.out.println("Autor: " + autor1.getName());
    }
    
}
