package modelo;

import java.time.LocalDate;
import java.io.Serializable;

public class Tarea implements Serializable {

    // Atributos
    private String titulo;
    private String descripcion;
    private String prioridad;
    private String plazo;
  

    // Constructor, getters y setters

    public Tarea(String titulo, String descripcion, String prioridad, String plazo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.plazo = plazo;
    }

    // Getters y setters
    public String getTitulo() {
        return this.titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }


    public String getPrioridad() {
        return this.prioridad;
    }

    public String getPlazo() {
        return this.plazo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }



    // Métodos

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                ", plazo=" + plazo +
                '}';
    }

    
    
    
}
