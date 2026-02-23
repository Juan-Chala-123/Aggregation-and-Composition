/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventcompany;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Supplier {

    private String name;
    private int telephone;
    private String supply;

    public Supplier(String name, int telephone, String supply) {
        this.name = name;
        this.telephone = telephone;
        this.supply = supply;
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }
}