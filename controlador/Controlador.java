package controlador;

import modelo.SistemaDeTareas;
import modelo.Tarea;
import vista.VentanaPrincipal;

public class Controlador {
    private SistemaDeTareas sistemaDeTareas;
    private VentanaPrincipal vista;

    public Controlador(SistemaDeTareas sistemaDeTareas, VentanaPrincipal vista) {
        this.sistemaDeTareas = sistemaDeTareas;
        this.vista = vista;
    }

    // Métodos para interactuar entre el sistemaDeTareas y la vista
}
