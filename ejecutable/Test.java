package ejecutable;

import controlador.Controlador;
import modelo.SistemaDeTareas;
import vista.VentanaPrincipal;

public class Test {
    public static void main(String[] args) {

        // Creamos una instancia de la clase SistemaDeTareas
        SistemaDeTareas sistemaDeTareas = new SistemaDeTareas();

        // Creamos una instancia de la clase VentanaPrincipal
        VentanaPrincipal vista = new VentanaPrincipal();

        // Creamos una instancia de la clase Controlador, pasándole como parámetros
        // la instancia de SistemaDeTareas y la instancia de VentanaPrincipal
        Controlador controlador = new Controlador(sistemaDeTareas, vista);
    }

    
}
