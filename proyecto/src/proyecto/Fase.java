/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author juani
 */
public class Fase {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private ArrayList<Tarea> tareas;//composición

    public Fase(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public void agregarTareas(String descripcion,String estado,int horasEstimadas){
        Tarea tarea=new Tarea(descripcion,estado,horasEstimadas);
        this.tareas.add(tarea);
    }
    
    public void eliminarTarea(Tarea tarea) {
        this.tareas.remove(tarea);
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

}
