/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorialpublicationsystem;

import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author CHALA RAMIREZ
 */
public class Authors {
    private String name;
    private ArrayList<Books> books;
    
    public Authors() {
        this.books = new ArrayList<>();
    }
    
    public Authors(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    
    public void addBooks(String title, String ISBN, LocalDate publicationDate) {
        Books b = new Books(title, ISBN, publicationDate);
        this.books.add(b);
    }
    
    // Getters y Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}