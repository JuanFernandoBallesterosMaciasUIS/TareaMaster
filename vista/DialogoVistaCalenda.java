package vista;

import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JDialog;

public class DialogoVistaCalenda extends JDialog {
    
    // Atributos
    private JTabbedPane tabbedPane;
    private DialogoJunio calenJunio;
    private DialogoMayo calenMayo;

    public DialogoVistaCalenda()
    {
        //Definición del layout del Dialogo
        this.setLayout(new BorderLayout());

        // Crear instancia de calenJunio
        calenJunio = new DialogoJunio();

        // Crear instancia de calenMayo
        calenMayo = new DialogoMayo();

        // Crear y agregar JTabbedPane
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Mayo", null, calenMayo, "Calendario de Mayo");
        tabbedPane.addTab("Junio", null, calenJunio, "Calendario de Junio");
        this.add(tabbedPane, BorderLayout.CENTER);
        this.add(tabbedPane, BorderLayout.CENTER);

        
        //Caracteristicas de la ventana
        this.setTitle("Calendario");
        this.setSize(1200,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}
