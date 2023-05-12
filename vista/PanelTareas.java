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
        this.setBackground(Color.decode ("#D4D7E9"));

        // Crear un objeto TitledBorder con una fuente y tamaño de fuente personalizados
        Font font = new Font("Arial", Font.BOLD, 17); 

        TitledBorder border = BorderFactory.createTitledBorder(null, "Tareas", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, font, Color.decode("#20124D"));

        // Asignar el borde personalizado al panel
        this.setBorder(border);
        
        // Configuración de los botones
        btCategoria1 = new JButton("Categoria 1");
        btCategoria1.setFont(new Font("Verdana", Font.BOLD, 15));
        btCategoria1.setBounds(20, 90, 180, 50);
        btCategoria1.setActionCommand("Categoria1");
        this.add(btCategoria1);

        btCategoria2 = new JButton("Categoria 2");
        btCategoria2.setFont(new Font("Verdana", Font.BOLD, 15));
        btCategoria2.setBounds(20, 155, 180, 50);
        btCategoria2.setActionCommand("Categoria2");
        this.add(btCategoria2);

        btCategoria3 = new JButton("Categoria 3");
        btCategoria3.setFont(new Font("Verdana", Font.BOLD, 15));
        btCategoria3.setBounds(20, 220, 180, 50);
        btCategoria3.setActionCommand("Categoria3");
        this.add(btCategoria3);

        btCategoria4 = new JButton("Categoria 4");
        btCategoria4.setFont(new Font("Verdana", Font.BOLD, 15));
        btCategoria4.setBounds(20, 285, 180, 50);
        btCategoria4.setActionCommand("Categoria4");
        this.add(btCategoria4);

        btCategoria5 = new JButton("Categoria 5");
        btCategoria5.setFont(new Font("Verdana", Font.BOLD, 15));
        btCategoria5.setBounds(20, 350, 180, 50);
        btCategoria5.setActionCommand("Categoria5");
        this.add(btCategoria5);

        btCategoria6 = new JButton("Categoria 6");
        btCategoria6.setFont(new Font("Verdana", Font.BOLD, 15));
        btCategoria6.setBounds(20, 415, 180, 50);
        btCategoria6.setActionCommand("Categoria6");
        this.add(btCategoria6);

        btModificarNombreCategoria = new JButton("Modificar categorias");
        btModificarNombreCategoria.setFont(new Font("Arial", Font.BOLD, 15));
        btModificarNombreCategoria.setBounds(17, 50, 189, 20);
        btModificarNombreCategoria.setActionCommand("modificarCategorias");
        this.add(btModificarNombreCategoria);


    }

    // Métodos para cambiar el texto de los botones

    public void setBtCategoria1(String pNombreCategoria) {
        btCategoria1.setText(pNombreCategoria);
    }

    public void setBtCategoria2(String pNombreCategoria) {
        btCategoria2.setText(pNombreCategoria);
    }

    public void setBtCategoria3(String pNombreCategoria) {
        btCategoria3.setText(pNombreCategoria);
    }

    public void setBtCategoria4(String pNombreCategoria) {
        btCategoria4.setText(pNombreCategoria);
    }

    public void setBtCategoria5(String pNombreCategoria) {
        btCategoria5.setText(pNombreCategoria);
    }

    public void setBtCategoria6(String pNombreCategoria) {
        btCategoria6.setText(pNombreCategoria);
    }

    // Métodos para obtener el texto de los botones

    public String getBtCategoria1() {
        return btCategoria1.getText();
    }

    public String getBtCategoria2() {
        return btCategoria2.getText();
    }

    public String getBtCategoria3() {
        return btCategoria3.getText();
    }

    public String getBtCategoria4() {
        return btCategoria4.getText();
    }

    public String getBtCategoria5() {
        return btCategoria5.getText();
    }

    public String getBtCategoria6() {
        return btCategoria6.getText();
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
