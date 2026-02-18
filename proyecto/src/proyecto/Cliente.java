/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author juani
 */
public class Cliente {
    private String nombre;
    private String correoElectronico;
    private int identificacionTributaria;

    public Cliente(String nombre, String correoElectronico, int identificacionTributaria) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.identificacionTributaria = identificacionTributaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getIdentificacionTributaria() {
        return identificacionTributaria;
    }

    public void setIdentificacionTributaria(int identificacionTributaria) {
        this.identificacionTributaria = identificacionTributaria;
    }   
}