/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;



/**
 *
 * @author juani
 */
public class Tarea {
    private String descripcion;
    private String estado;
    private int horasEstimadas;

    public Tarea(String descripcion, String estado, int horasEstimadas) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.horasEstimadas = horasEstimadas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    
}
