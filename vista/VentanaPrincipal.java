package vista;

import javax.swing.JFrame;

import java.awt.Panel;
import java.awt.event.WindowAdapter;


public class VentanaPrincipal extends JFrame {


    // Atributos
    public DialogoVistaCalenda miDialogoVistaCalenda;
    public DialogoJunio miDialogoCalendario;
    public DialogoCategoria miDialogoCategoria;
    public DialogoInfoSemana miDialogoInfoSemana;

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

    // Crear Dialogo PanelAgregarTarea
    public void crearDialogoAgregarTarea()
    {
        miDialogoCategoria = new DialogoCategoria();
    }

    // Dialogo Categoria
    public void crearDialogoCategoria()
    {
        miDialogoCategoria = new DialogoCategoria();
    }

    //Crear Dialogo AgregarVendedor
    public void crearDialogoCalendario()
    {
        miDialogoCalendario = new DialogoJunio();
    }

    // Dialogo Vista Calendario
    public void crearDialogoVistaCalenda()
    {
        miDialogoVistaCalenda = new DialogoVistaCalenda();
    }

    // Dialogo Info Semana
    public void crearDialogoInfoSemana()
    {
        miDialogoInfoSemana = new DialogoInfoSemana();
        miDialogoInfoSemana.pack(); // Esto ajusta el tamaño del diálogo para acomodar sus subcomponentes
        miDialogoInfoSemana.setVisible(true); // Esto muestra el diálogo
    }



}
