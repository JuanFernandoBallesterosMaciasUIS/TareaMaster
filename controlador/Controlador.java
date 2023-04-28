package controlador;

import modelo.SistemaDeTareas;
import vista.VentanaPrincipal;

public class Controlador {
    // Definimos los atributos de la clase
    private SistemaDeTareas sistemaDeTareas;
    private VentanaPrincipal vista;
    
    // Constructor de la clase
    public Controlador(SistemaDeTareas sistemaDeTareas, VentanaPrincipal vista) {
    // Asignamos los parámetros recibidos a los atributos de la clase
    this.sistemaDeTareas = sistemaDeTareas;
    this.vista = vista;
    }

    // Métodos para interactuar entre el sistemaDeTareas y la vista
}
