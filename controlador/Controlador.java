package controlador;

import modelo.ListaDeTareas;
import modelo.SistemaDeTareas;
import modelo.Tarea;
import vista.PanelAgregarTarea;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// importa JOptionPane
import javax.swing.JOptionPane;

public class Controlador implements ActionListener 
{
    private VentanaPrincipal vistaPrincipal;
    private SistemaDeTareas sistemaDeTareas;
    

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
        vistaPrincipal.miPanelAgregarTarea = new PanelAgregarTarea();
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
            vistaPrincipal.miDialogoAgregarTarea.agregarOyenteBoton(this);
   
  
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
        if(comando.equals("agregar"))
        {
            // imprimir en consola
            System.out.println("Se ha agregado una tarea");
            String titulo = vistaPrincipal.miDialogoAgregarTarea.getTxtTitulo();
            String descripcion = vistaPrincipal.miDialogoAgregarTarea.getTxtDescripcion();
            String prioridad = vistaPrincipal.miDialogoAgregarTarea.getTxtPrioridad();
            String plazo = vistaPrincipal.miDialogoAgregarTarea.getTxtPlazo();
            Tarea nuevaTarea = new Tarea(titulo, descripcion, prioridad, plazo);
            listaDeTareas.agregarTarea(nuevaTarea);
            // Log de la tarea agregada
            System.out.println("Se ha agregado la tarea " + nuevaTarea.getTitulo());
            // imprimir lista de tareas en consola
            System.out.println(listaDeTareas.toString());

            // agregar lista de tareas al al textFiel 
            vistaPrincipal.miPanelCalendario.insertarTexto(listaDeTareas.toString());
            // utilizar un JOptionPane para mostrar un mensaje de confirmación
            JOptionPane.showMessageDialog(null, "Se ha agregado la tarea " + nuevaTarea.getTitulo());
            vistaPrincipal.miDialogoAgregarTarea.dispose();
        }

        //Abrir ventana de las tareas
        if(comando.equals("editar2"))
        {
            System.out.println("Se ha agregado una tarea");
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
