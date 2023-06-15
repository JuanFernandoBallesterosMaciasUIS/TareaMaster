package vista;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.BorderFactory;

import java.awt.Color;

//import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionListener;

import vista.PanelTareas;

public class DialogoAgregarTarea extends JDialog {

    //----------------------
    // Atributos
    //----------------------
    // Atributos
    private JLabel lbTitulo;
    private JLabel lbDescripcion;
    private JLabel lbPrioridad;
    private JLabel lbPlazo;

    private JTextArea txtTitulo;
    private JTextArea txtDescripcion;
    private JTextArea txtPrioridad;
    private JTextArea txtPlazo;

    private JButton btAgregarTarea;


    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarTarea()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        // Creación de una forma simetrica

        //Creación de la etiqueta titulo
        lbTitulo = new JLabel("Titulo:");
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 15));
        lbTitulo.setBounds(20, 20, 100, 25);
        this.add(lbTitulo);

        //Creación de la etiqueta descripcion
        lbDescripcion = new JLabel("Descripcion:");
        lbDescripcion.setFont(new Font("Verdana", Font.BOLD, 15));
        lbDescripcion.setBounds(20, 60, 100, 25);
        this.add(lbDescripcion);

        //Creación de la etiqueta prioridad
        lbPrioridad = new JLabel("Prioridad:");
        lbPrioridad.setFont(new Font("Verdana", Font.BOLD, 15));
        lbPrioridad.setBounds(20, 100, 100, 25);
        this.add(lbPrioridad);

        //Creación de la etiqueta plazo
        lbPlazo = new JLabel("Plazo:");
        lbPlazo.setFont(new Font("Verdana", Font.BOLD, 15));
        lbPlazo.setBounds(20, 140, 100, 25);
        this.add(lbPlazo);

        //Creación del campo de texto titulo
        txtTitulo = new JTextArea();
        txtTitulo.setFont(new Font("Verdana", Font.BOLD, 15));
        txtTitulo.setBounds(120, 20, 200, 25);
        this.add(txtTitulo);

        //Creación del campo de texto descripcion
        txtDescripcion = new JTextArea();
        txtDescripcion.setFont(new Font("Verdana", Font.BOLD, 15));
        txtDescripcion.setBounds(120, 60, 200, 25);
        this.add(txtDescripcion);

        //Creación del campo de texto prioridad
        txtPrioridad = new JTextArea();
        txtPrioridad.setFont(new Font("Verdana", Font.BOLD, 15));
        txtPrioridad.setBounds(120, 100, 200, 25);
        this.add(txtPrioridad);

        //Creación del campo de texto plazo
        txtPlazo = new JTextArea();
        txtPlazo.setFont(new Font("Verdana", Font.BOLD, 15));
        txtPlazo.setBounds(120, 140, 200, 25);
        this.add(txtPlazo);

        //Creación del botón agregar tarea
        btAgregarTarea = new JButton("Agregar");
        btAgregarTarea.setFont(new Font("Verdana", Font.BOLD, 15));
        btAgregarTarea.setBounds(100, 180, 100, 25);
        btAgregarTarea.setActionCommand("agregar");
        // se agrega color al boton
        btAgregarTarea.setBackground(Color.decode("#092c86"));
        btAgregarTarea.setForeground(Color.WHITE);
        btAgregarTarea.setBorder(BorderFactory.createLineBorder(Color.decode("#101343"), 2));

        this.add(btAgregarTarea);

        // Caracteristicas de la ventana
        this.setTitle("Agregar Tarea");
        this.setSize(350, 250);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);




    }

    //Metodos de acceso


    
    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarTarea.addActionListener(pAL);

    }

}

    

