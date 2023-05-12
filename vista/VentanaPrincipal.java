package vista;

import javax.swing.JFrame;

import java.awt.Panel;
import java.awt.event.WindowAdapter;


public class VentanaPrincipal extends JFrame {


    // Atributos
    public DialogoCalendario miDialogoCalendario;
    public DialogoCategoria miDialogoCategoria;
    public PanelCalendario miPanelCalendario;
    public PanelSemana miPanelSemana;
    public PanelTareas miPanelTareas;

    //private PanelTareas panelTareas;

    public VentanaPrincipal() {

        // Definiendo el layout
        this.setLayout(null);

        // Configuración de los paneles

        //Creación y adición del PanelTareas
        miPanelTareas = new PanelTareas();
        miPanelTareas.setBounds(10, 10, 220, 545);
        this.add(miPanelTareas);
        
        //Creación y adición del PanelCalendario
        miPanelCalendario= new PanelCalendario();
        miPanelCalendario.setBounds(500, 10, 480, 545);
        this.add(miPanelCalendario);

        //Creación y adición del PanelSemana
        miPanelSemana = new PanelSemana();
        miPanelSemana.setBounds(240, 10, 250, 545);
        this.add(miPanelSemana);

        // Configuración de la ventana
        this.setTitle("Sistema de tareas - TareaMaster");
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Modificado para poder guardar antes de cerrar
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


    public void addWindowClosingListener(WindowAdapter windowAdapter) {
        this.addWindowListener(windowAdapter);
    }

    //Crear Dialogo AgregarVendedor
    public void crearDialogoCalendario()
    {
        miDialogoCalendario = new DialogoCalendario();
    }

    // Dialogo Categoria
    public void crearDialogoCategoria()
    {
        miDialogoCategoria = new DialogoCategoria();
    }


}
