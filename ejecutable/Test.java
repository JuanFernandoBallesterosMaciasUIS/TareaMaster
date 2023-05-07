package ejecutable;

import controlador.Controlador;
import modelo.SistemaDeTareas;
import vista.VentanaPrincipal;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {
    public static void main(String[] args) {
        
        SistemaDeTareas sistemaDeTareas = new SistemaDeTareas();
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        Controlador controlador = new Controlador(ventanaPrincipal, sistemaDeTareas);

        ventanaPrincipal.addWindowClosingListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                sistemaDeTareas.guardarTareas();
                System.exit(0); // Finalizar el programa después de guardar las tareas
            }
        });
    }
}
