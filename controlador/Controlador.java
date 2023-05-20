package controlador;

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
        this.vistaPrincipal.miPanelTareas.addOyente(this);

    }
    // Métodos para interactuar entre el sistemaDeTareas y la vista

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
        if(comando.equals("calendario"))
        {
            vistaPrincipal.crearDialogoVistaCalenda();
            
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
