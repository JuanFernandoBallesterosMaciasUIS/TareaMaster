package vista;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;

public class VentanaPrincipal extends JFrame {


    // Atributos

    //private PanelTareas panelTareas;

    public VentanaPrincipal() {

        // Definiendo el layout
        this.setLayout(null);

        // Configuración de los paneles

        //Creación y adición del PanelTareas
        PanelTareas panelTareas = new PanelTareas();
        panelTareas.setBounds(10, 10, 200, 545);
        this.add(panelTareas);

        //Creación y adición del PanelCalendario
        PanelCalendario panelCalendario = new PanelCalendario();
        panelCalendario.setBounds(500, 10, 480, 545);
        this.add(panelCalendario);

    

        // Configuración de la ventana
        this.setTitle("Sistema de Tareas");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Modificado para poder guardar antes de cerrar
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }



    public void addWindowClosingListener(WindowAdapter windowAdapter) {
        this.addWindowListener(windowAdapter);
    }
}
