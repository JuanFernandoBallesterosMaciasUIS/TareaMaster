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

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    // Métodos para obtener tareas por categoría
    public ArrayList<Tarea> getTareasPorCategoria(String categoria) {
        ArrayList<Tarea> tareasPorCategoria = new ArrayList<>();
        for (Tarea tarea : tareas) {
            if (tarea.getCategoria().equals(categoria)) {
                tareasPorCategoria.add(tarea);
            }
        }
        return tareasPorCategoria;
    }


}
