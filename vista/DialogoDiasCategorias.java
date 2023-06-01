package vista;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Dimension;

public class DialogoDiasCategorias extends JPanel {

    // Atributos
    private JTextArea tareasIncompletas;

    public DialogoDiasCategorias() {
        // Crear instancia de tareasIncompletas
        tareasIncompletas = new JTextArea();
        tareasIncompletas.setBorder(BorderFactory.createTitledBorder("Tareas  por hacer"));
        
        // Establecer el tamaño preferido del JTextArea
        tareasIncompletas.setPreferredSize(new Dimension(400, 300));

        this.add(tareasIncompletas);
    }
}