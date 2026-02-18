/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author juani
 */
public class Proyecto {

    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFinEstimada;
    private ArrayList<Empleado> listaEmpleados; 

    public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFinEstimada) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimada = fechaFinEstimada;
    }
    
    public void agregarEmpleado(Empleado empleado){
        this.listaEmpleados.add(empleado);
    }
    
    public void eliminarEmpleado(Empleado empleado){
        this.listaEmpleados.remove(empleado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(LocalDate fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }
    
    
    
    
}
