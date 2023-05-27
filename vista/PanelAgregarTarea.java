package vista;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;


// Este panel se muestra cuando se presiona cualquier categoria en el panel de tareas, se muestra un apartado para que el usuario ingrese el titulo, la descripción, la prioridad y el plazo de la tarea
public class PanelAgregarTarea extends JDialog {
    
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
    
        public PanelAgregarTarea() {
    
            // Definiendo el layout
            this.setLayout(null);
    
            // Configuración del panel
            this.setBackground(Color.decode ("#D4D7E9"));



    
            // Crear un objeto TitledBorder con una fuente y tamaño de fuente personalizados
            Font font = new Font("Arial", Font.BOLD, 17); 
            
            TitledBorder border = BorderFactory.createTitledBorder(null, "Agregar Tarea", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, font, Color.decode("#20124D"));
    
            // Asignar el borde personalizado al panel
            this.setBorder(border);
    
            // Configuración de los botones
            btAgregarTarea = new JButton("Agregar Tarea");
            btAgregarTarea.setFont(new Font("Verdana", Font.BOLD, 15));
            btAgregarTarea.setBounds(100, 120, 100, 25);
            btAgregarTarea.setActionCommand("agregarTarea");
            this.add(btAgregarTarea);
    
            // Configuración de los labels
            lbTitulo = new JLabel("Titulo:");
            lbTitulo.setFont(new Font("Verdana", Font.BOLD, 15));
            lbTitulo.setBounds(49, 30, 80, 25);
            this.add(lbTitulo);
    
            lbDescripcion = new JLabel("Descripcion:");
            lbDescripcion.setFont(new Font("Verdana", Font.BOLD, 15));
            lbDescripcion.setBounds(49, 60, 100, 25);
            this.add(lbDescripcion);
    
            lbPrioridad = new JLabel("Prioridad:");
            lbPrioridad.setFont(new Font("Verdana", Font.BOLD, 15));
            lbPrioridad.setBounds(49, 90, 100, 25);
            this.add(lbPrioridad);
    
            lbPlazo = new JLabel("Plazo:");
            lbPlazo.setFont(new Font("Verdana", Font.BOLD, 15));
            lbPlazo.setBounds(49, 120, 100, 25);
            this.add(lbPlazo);
    
            // Configuración de los text
            txtTitulo = new JTextArea();
            txtTitulo.setBounds(130, 30, 120, 25);
            txtTitulo.setFont(new Font("Arial", Font.PLAIN, 15));
            this.add(txtTitulo);

            txtDescripcion = new JTextArea();
            txtDescripcion.setBounds(130, 60, 120, 25);
            txtDescripcion.setFont(new Font("Arial", Font.PLAIN, 15));
            this.add(txtDescripcion);

            txtPrioridad = new JTextArea();
            txtPrioridad.setBounds(130, 90, 120, 25);
            txtPrioridad.setFont(new Font("Arial", Font.PLAIN, 15));
            this.add(txtPrioridad);

            txtPlazo = new JTextArea();
            txtPlazo.setBounds(130, 120, 120, 25);
            txtPlazo.setFont(new Font("Arial", Font.PLAIN, 15));
            this.add(txtPlazo);

            //Definición del contenedor del panel
            this.setLayout(null);
            this.setBackground(Color.decode ("#D4D7E9"));
        }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarTarea.addActionListener(pAL);
    }
}
