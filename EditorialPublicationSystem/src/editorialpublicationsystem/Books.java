/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorialpublicationsystem;

import java.util.*;
import java.time.LocalDate;
/**
 *
 * @author CHALA RAMIREZ
 */
public class Books {
    private String title;
    private String ISBN;
    private LocalDate publicationDate;
    private ArrayList<Chapters> chapters;
    
    public Books(String title, String ISBN, LocalDate publicationDate) {
        this.title = title;
        this.ISBN = ISBN;
        this.publicationDate = publicationDate;
        this.chapters = new ArrayList<>();
    }
    
    public void addChapters(Chapters c) {
        this.chapters.add(c);
    }
    
    public void removeChapters(Chapters c) {
        this.chapters.remove(c);
    }
    
    // Getters y Setters
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public LocalDate getPublicationDate() {
        return publicationDate;
    }
    
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public ArrayList<Chapters> getChapters() {
        return chapters;
    }
}
