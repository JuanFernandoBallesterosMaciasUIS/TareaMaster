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
    private JButton btCalenda;

    public PanelCalendario() {

        // Definiendo el layout
        this.setLayout(null);

        //Crear y agregar area de texto Resultados con un borde llamado Tareas
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(10, 350, 460, 190);
        areaTexto.setBorder(BorderFactory.createTitledBorder("Recomendaciones"));
        this.add(areaTexto);



        // Configuración del panel calendario
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createTitledBorder(null, "Calendario", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));


        // Configuración del boton 1
        btCalenda = new JButton("");
        btCalenda.setBounds(110, 90, 270, 245);
        this.add(btCalenda);

        //codigo para ponerle la imagen mayo.jpg al boton 1 
        ImageIcon icono = new ImageIcon("mayo.jpg");
        btCalenda.setIcon(icono);

        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

 



        
        


    }


    
}