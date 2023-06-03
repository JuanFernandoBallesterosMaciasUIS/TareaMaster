package modelo;

import java.time.LocalDate;
import java.io.Serializable;

public class Tarea implements Serializable {

    // Atributos
    private String titulo;
    private String descripcion;
    private String categoria;
    private int prioridad;
    private LocalDate plazo;
    private boolean completada;

    // Constructor, getters y setters

    public Tarea(String titulo, String descripcion, String categoria, int prioridad, LocalDate plazo, boolean completada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.plazo = plazo;
        this.completada = completada;
    }

    // Getters y setters
    public String getTitulo() {
        return this.titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public LocalDate getPlazo() {
        return this.plazo;
    }

    public boolean getCompletada() {
        return this.completada;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setPlazo(LocalDate plazo) {
        this.plazo = plazo;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Métodos

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", prioridad=" + prioridad +
                ", plazo=" + plazo +
                ", completada=" + completada +
                '}';
    }

    
    
    
}
