/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventcompany;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Customer {

    private String name;
    private int telephone;
    private String email;
    private String address;

    public Customer(String name, int telephone, String email, String address) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }
}