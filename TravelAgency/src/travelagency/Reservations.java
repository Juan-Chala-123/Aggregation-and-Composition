/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelagency;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Reservations {
    private String nameHotel;
    private String location;
    private String country;
    
    public Reservations() {
    }
    
    public Reservations(String nameHotel, String location, String country) {
        this.nameHotel = nameHotel;
        this.location = location;
        this.country = country;
    }
    public String getNameHotel() {
        return nameHotel;
    }
    
    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
}