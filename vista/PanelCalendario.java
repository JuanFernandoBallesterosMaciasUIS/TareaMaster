package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelCalendario extends JPanel{

    // En este panel se mostrarán las tareas por categorias (ejemplo: Univesidad, Hogar Tareas a largo plazo, etc) y se podrá agregar, editar y eliminar tareas


    // Atributos
    private JButton btCalendario;
    private JTextArea areaTexto;

    public PanelCalendario() {

        // Definiendo el layout
        this.setLayout(null);

        //Crear y agregar area de texto Resultados con un borde llamado Tareas
        areaTexto = new JTextArea();
        areaTexto.setBounds(10, 350, 460, 190);
        areaTexto.setBorder(BorderFactory.createTitledBorder("Recomendaciones"));
        this.add(areaTexto);



        // Configuración del panel calendario
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createTitledBorder(null, "Calendario", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));


        // Configuración del boton 1
        btCalendario = new JButton("");
        btCalendario.setBounds(110, 90, 270, 245);
        btCalendario.setActionCommand("calendario");
        this.add(btCalendario);

        //codigo para ponerle la imagen mayo.jpg al boton 1 
        ImageIcon icono = new ImageIcon("mayo.jpg");
        btCalendario.setIcon(icono);

        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);       

    }

    // Método para agregar oyentes a los botones
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btCalendario.addActionListener(pAL);
        
    }



    
}