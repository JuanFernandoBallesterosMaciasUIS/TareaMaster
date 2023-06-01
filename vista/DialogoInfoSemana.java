package vista;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class DialogoInfoSemana extends JDialog {

    // Atributos
    private JTextArea tareasIncompletas;

    public DialogoInfoSemana() {

        // Definición del layout del Dialogo
        this.setLayout(new BorderLayout());

        // Crear instancia de tareasIncompletas
        tareasIncompletas = new JTextArea();
        tareasIncompletas.setBorder(BorderFactory.createTitledBorder("Tareas por hacer"));
        
        // Establecer el tamaño preferido del JTextArea
        tareasIncompletas.setPreferredSize(new Dimension(400, 300));

        // titulo de la ventana
        this.setTitle("Información del día");
        
        this.add(tareasIncompletas);

    
        
    }
}
