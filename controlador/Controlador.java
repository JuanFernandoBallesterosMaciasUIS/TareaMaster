package controlador;

import modelo.ListaDeTareas;
import modelo.SistemaDeTareas;
import modelo.Tarea;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener 
{
    private SistemaDeTareas sistemaDeTareas;
    private VentanaPrincipal vistaPrincipal;

    //------------------
    //Metodos
    //------------------

    //Constructor

    public Controlador(VentanaPrincipal pVistaPrincipal, SistemaDeTareas pSistemaDeTareas) {
        this.sistemaDeTareas = pSistemaDeTareas;
        this.vistaPrincipal = pVistaPrincipal;
        this.vistaPrincipal.miPanelCalendario.agregarOyentesBotones(this);
        this.vistaPrincipal.miPanelTareas.agregarOyenteBoton(this);
        this.vistaPrincipal.miPanelSemana.agregarOyentesBotones(this);
        this.vistaPrincipal.miPanelAgregarTarea.agregarOyenteBoton(this);
        
    }

    // Crear objeto listaDeTareas 
    ListaDeTareas listaDeTareas = new ListaDeTareas();
    // Métodos para interactuar entre el sistemaDeTareas y la vista

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana de los calendarios
        if(comando.equals("calendario"))
        {
            vistaPrincipal.crearDialogoVistaCalenda();
            
        }

        // Abrir Agregar Tarea categoria 1
        if(comando.equals("Categoria1"))
        {
            vistaPrincipal.crearDialogoAgregarTarea();
        }
        if(comando.equals("Categoria2"))
        {
            vistaPrincipal.crearDialogoAgregarTarea();
        }
        if(comando.equals("Categoria3"))
        {
            vistaPrincipal.crearDialogoAgregarTarea();
        }
        if(comando.equals("Categoria4"))
        {
            vistaPrincipal.crearDialogoAgregarTarea();
        }
        if(comando.equals("Categoria5"))
        {
            vistaPrincipal.crearDialogoAgregarTarea();
        }
        if(comando.equals("Categoria6"))
        {
            vistaPrincipal.crearDialogoAgregarTarea();
        }

        //Agregar Tarea
        if(comando.equals("agregarTarea"))
        {
            // imprimir en consola
            System.out.println("Se ha agregado una tarea");
            String titulo = vistaPrincipal.miPanelAgregarTarea.getTxtTitulo();
            String descripcion = vistaPrincipal.miPanelAgregarTarea.getTxtDescripcion();
            String prioridad = vistaPrincipal.miPanelAgregarTarea.getTxtPrioridad();
            String plazo = vistaPrincipal.miPanelAgregarTarea.getTxtPlazo();
            Tarea nuevaTarea = new Tarea(titulo, descripcion, prioridad, plazo);
            listaDeTareas.agregarTarea(nuevaTarea);

        }
       

        

        //Abrir ventana de Lunes
        if(comando.equals("lunes"))
        {
            vistaPrincipal.crearDialogoInfoSemana();
        }

        //Abrir ventana de Martes
        if(comando.equals("martes"))
        {
            vistaPrincipal.crearDialogoInfoSemana();
        }

        //Abrir ventana de Miercoles
        if(comando.equals("miercoles"))
        {
            vistaPrincipal.crearDialogoInfoSemana();
        }

        //Abrir ventana de Jueves
        if(comando.equals("jueves"))
        {
            vistaPrincipal.crearDialogoInfoSemana();
        }

        //Abrir ventana de Viernes
        if(comando.equals("viernes"))
        {
            vistaPrincipal.crearDialogoInfoSemana();
        }

        //Abrir ventana de Sabado
        if(comando.equals("sabado"))
        {
            vistaPrincipal.crearDialogoInfoSemana();
        }

        //Abrir ventana de Domingo
        if(comando.equals("domingo"))
        {
            vistaPrincipal.crearDialogoInfoSemana();
        }
        
        //Abrir ventana Editar Categoria
        if(comando.equals("modificarCategorias"))
        {
            vistaPrincipal.crearDialogoCategoria();
            vistaPrincipal.miDialogoCategoria.agregarOyenteBoton(this);
        }

        // editar categoria
        if(comando.equals("editar"))
        {
            int nombreCategoria = vistaPrincipal.miDialogoCategoria.getCbCategoria();
            String nombreNuevo = vistaPrincipal.miDialogoCategoria.getTxtNombre();
            vistaPrincipal.miPanelTareas.cambiarNombreCategoria(nombreCategoria + 1, nombreNuevo);
            vistaPrincipal.miDialogoCategoria.editarCategoria2();
            vistaPrincipal.miDialogoCategoria.dispose();
        }

    
    }
}
