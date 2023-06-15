package modelo;

import java.util.ArrayList;

public class ListaDeTareas {

    // Atributos
    private ArrayList<Tarea> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    // Métodos para agregar, editar y eliminar tareas
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void editarTarea(Tarea tarea, int indice) {
        tareas.set(indice, tarea);
    }

    public void eliminarTarea(int indice) {
        tareas.remove(indice);
    }

    // Métodos para obtener tareas

    public Tarea getTarea(int indice) {
        return tareas.get(indice);
    }

    public int getNumeroDeTareas() {
        return tareas.size();
    }

    // Métodos para obtener la lista de tareas 
    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    // toString en un formato legible, que cada atributo de la tarea esté en una línea (\n)
    @Override
    public String toString() {
        String lista = "";
        for (Tarea tarea : tareas) {
            lista += tarea.toString() + "\n";
        }
        return lista;
    }
}
