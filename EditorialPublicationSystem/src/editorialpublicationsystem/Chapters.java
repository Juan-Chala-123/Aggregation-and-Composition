/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorialpublicationsystem;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Chapters {
    private String title;
    private int pages;
    
    public Chapters(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    
    // Getters y Setters
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
}
