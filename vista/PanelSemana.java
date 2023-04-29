package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelSemana extends JPanel{

    // En este panel se mostrarán los dias de la semana y se podra ver las tareas de cada dia

    // Atributos
    private JButton btLunes;
    private JButton btMartes;
    private JButton btMiercoles;
    private JButton btJueves;
    private JButton btViernes;
    private JButton btSabado;
    private JButton btDomingo;

    public PanelSemana() {

        // Definiendo el layout
        this.setLayout(null);

        // Configuración del panel
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createTitledBorder(null, "Semana", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLACK));

        // Configuración de los botones
        btLunes = new JButton("Lunes");
        btLunes.setBounds(40, 90, 180, 40);
        this.add(btLunes);

        btMartes = new JButton("Martes");
        btMartes.setBounds(40, 140, 180, 40);
        this.add(btMartes);

        btMiercoles = new JButton("Miercoles");
        btMiercoles.setBounds(40, 190, 180, 40);
        this.add(btMiercoles);

        btJueves = new JButton("Jueves");
        btJueves.setBounds(40, 240, 180, 40);
        this.add(btJueves);

        btViernes = new JButton("Viernes");
        btViernes.setBounds(40, 290, 180, 40);
        this.add(btViernes);

        btSabado = new JButton("Sabado");
        btSabado.setBounds(40, 340, 180, 40);
        this.add(btSabado);

        btDomingo = new JButton("Domingo");
        btDomingo.setBounds(40, 390, 180, 40);
        this.add(btDomingo);


        
    }

    
}
