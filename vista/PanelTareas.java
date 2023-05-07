package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelTareas extends JPanel{

    // En este panel se mostrarán las tareas por categorias (ejemplo: Univesidad, Hogar Tareas a largo plazo, etc) y se podrá agregar, editar y eliminar tareas


    // Atributos
    private JButton btCategoria1;
    private JButton btCategoria2;
    private JButton btCategoria3;
    private JButton btCategoria4;
    private JButton btCategoria5;
    private JButton btCategoria6;
    private JButton btModificarNombreCategoria;

    public PanelTareas() {

        // Definiendo el layout
        this.setLayout(null);

        // Configuración del panel
        this.setBackground(Color.WHITE);

        // Crear un objeto TitledBorder con una fuente y tamaño de fuente personalizados
        Font font = new Font("Arial", Font.BOLD, 15); 

        TitledBorder border = BorderFactory.createTitledBorder(null, "Tareas", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, font, Color.BLACK);

        // Asignar el borde personalizado al panel
        this.setBorder(border);
        
        // Configuración de los botones
        btCategoria1 = new JButton("Categoria 1");
        btCategoria1.setBounds(20, 90, 180, 50);
        btCategoria1.setActionCommand("Categoria 1");
        this.add(btCategoria1);

        btCategoria2 = new JButton("Categoria 2");
        btCategoria2.setBounds(20, 155, 180, 50);
        btCategoria2.setActionCommand("Categoria 2");
        this.add(btCategoria2);

        btCategoria3 = new JButton("Categoria 3");
        btCategoria3.setBounds(20, 220, 180, 50);
        btCategoria3.setActionCommand("Categoria 3");
        this.add(btCategoria3);

        btCategoria4 = new JButton("Categoria 4");
        btCategoria4.setBounds(20, 285, 180, 50);
        btCategoria4.setActionCommand("Categoria 4");
        this.add(btCategoria4);

        btCategoria5 = new JButton("Categoria 5");
        btCategoria5.setBounds(20, 350, 180, 50);
        btCategoria5.setActionCommand("Categoria 5");
        this.add(btCategoria5);

        btCategoria6 = new JButton("Categoria 6");
        btCategoria6.setBounds(20, 415, 180, 50);
        btCategoria6.setActionCommand("Categoria 6");
        this.add(btCategoria6);

        btModificarNombreCategoria = new JButton("Modificar categorias");
        btModificarNombreCategoria.setBounds(40, 50, 150, 20);
        btModificarNombreCategoria.setActionCommand("Modificar categorias");
        this.add(btModificarNombreCategoria);


    }

    // Método para agregar oyentes a los botones
    public void addOyente(ActionListener pAL) {
        btCategoria1.addActionListener(pAL);
        btCategoria2.addActionListener(pAL);
        btCategoria3.addActionListener(pAL);
        btCategoria4.addActionListener(pAL);
        btCategoria5.addActionListener(pAL);
        btCategoria6.addActionListener(pAL);
        btModificarNombreCategoria.addActionListener(pAL);
    }
}
