package vista;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;

import java.awt.Color;

//import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionListener;

import vista.PanelTareas;

public class DialogoCategoria extends JDialog {

    //----------------------
    // Atributos
    //----------------------
    private Label lbCategoria;
    private JComboBox cbCategoria;

    private Label lbNombre;
    private JTextField txtNombre;

    private JButton btEditarCategoria;

    private PanelTareas panelTareas;


    //----------------------
    // Metodos
    //----------------------
    public DialogoCategoria()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);
        this.panelTareas = new PanelTareas();



        // Creación de una forma simetrica

        //Creación del botón editar categoria-
        btEditarCategoria = new JButton("Editar");
        btEditarCategoria.setFont(new Font("Verdana", Font.BOLD, 15));
        btEditarCategoria.setBounds(100, 120, 100, 25);
        btEditarCategoria.setActionCommand("editar");
        // se agrega color al boton
        btEditarCategoria.setBackground(Color.decode("#092c86"));
        btEditarCategoria.setForeground(Color.WHITE);
        btEditarCategoria.setBorder(BorderFactory.createLineBorder(Color.decode("#101343"), 2));

        this.add(btEditarCategoria);

        //Creación de la etiqueta categoria-
        lbCategoria = new Label("Categoria:");
        lbCategoria.setFont(new Font("Verdana", Font.BOLD, 15));
        lbCategoria.setBounds(49, 30, 80, 25);
        this.add(lbCategoria);

        
        //Creación del combobox categoria y agregar las categorias existentes
        cbCategoria = new JComboBox();
        cbCategoria.setBounds(130, 30, 120, 25);
        cbCategoria.setFont(new Font("Arial", Font.PLAIN, 15));
        cbCategoria.addItem(panelTareas.getBtCategoria1());
        cbCategoria.addItem(panelTareas.getBtCategoria2());
        cbCategoria.addItem(panelTareas.getBtCategoria3());
        cbCategoria.addItem(panelTareas.getBtCategoria4());
        cbCategoria.addItem(panelTareas.getBtCategoria5());
        cbCategoria.addItem(panelTareas.getBtCategoria6());
        this.add(cbCategoria);

        //Creación de la etiqueta nombre
        lbNombre = new Label("Nombre:");
        lbNombre.setFont(new Font("Verdana", Font.BOLD, 15));
        
        lbNombre.setBounds(50, 70, 80, 25);
        this.add(lbNombre);

        //Creación del textfield nombre
        txtNombre = new JTextField();
        txtNombre.setFont(new Font("Arial", Font.BOLD, 15));
        txtNombre.setBounds(130, 70, 120, 25);
        this.add(txtNombre);



        //Caracteristicas de la ventana
        this.setTitle("Categoria");
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);


    }

    //Metodos de acceso

    public String getTxtNombre()
    {
        return txtNombre.getText();
    }
    
    public int getCbCategoria()
    {
        return cbCategoria.getSelectedIndex();
    }

    public void setCbCategoria(JComboBox cbCategoria) {
        this.cbCategoria = cbCategoria;
    }

    // Metodos de modificacion, obtiene el indice de la categoria y el nombre nuevo y lo cambia en el combobox
    public void editarCategoria2()
    {
        cbCategoria.setSelectedItem(panelTareas.getBtCategoria1());
        cbCategoria.addItem(panelTareas.getBtCategoria2());
        cbCategoria.addItem(panelTareas.getBtCategoria3());
        cbCategoria.addItem(panelTareas.getBtCategoria4());
        cbCategoria.addItem(panelTareas.getBtCategoria5());
        cbCategoria.addItem(panelTareas.getBtCategoria6());
    }

    public void editarCategoria(int indice, String nombreNuevo) {
        // Modificar el nombre de la categoria en el combobox
        cbCategoria.removeItemAt(indice);
        cbCategoria.insertItemAt(nombreNuevo, indice);
    }
    
    public void agregarOyenteBoton(ActionListener pAL)
    {
        btEditarCategoria.addActionListener(pAL);

    }

}

    

