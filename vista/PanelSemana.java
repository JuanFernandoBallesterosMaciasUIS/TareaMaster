package vista;

import java.awt.Color;
import java.awt.Font;
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
        this.setBackground(Color.decode ("#D4D7E9"));

        // Crear un objeto TitledBorder con una fuente y tamaño de fuente personalizados
        Font font = new Font("Arial", Font.BOLD, 17); 

        TitledBorder border = BorderFactory.createTitledBorder(null, "Semana", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, font, Color.decode("#20124D"));
        // Asignar el borde personalizado al panel
        this.setBorder(border);

        // Configuración de los botones
        btLunes = new JButton("Lunes");
        btLunes.setFont(new Font("Verdana", Font.BOLD, 15));
        btLunes.setBounds(40, 90, 180, 40);
        this.add(btLunes);

        btMartes = new JButton("Martes");
        btMartes.setFont(new Font("Verdana", Font.BOLD, 15));
        btMartes.setBounds(40, 140, 180, 40);
        this.add(btMartes);

        btMiercoles = new JButton("Miercoles");
        btMiercoles.setFont(new Font("Verdana", Font.BOLD, 15));
        btMiercoles.setBounds(40, 190, 180, 40);
        this.add(btMiercoles);

        btJueves = new JButton("Jueves");
        btJueves.setFont(new Font("Verdana", Font.BOLD, 15));
        btJueves.setBounds(40, 240, 180, 40);
        this.add(btJueves);

        btViernes = new JButton("Viernes");
        btViernes.setFont(new Font("Verdana", Font.BOLD, 15));
        btViernes.setBounds(40, 290, 180, 40);
        this.add(btViernes);

        btSabado = new JButton("Sabado");
        btSabado.setFont(new Font("Verdana", Font.BOLD, 15));
        btSabado.setBounds(40, 340, 180, 40);
        this.add(btSabado);

        btDomingo = new JButton("Domingo");
        btDomingo.setFont(new Font("Verdana", Font.BOLD, 15));
        btDomingo.setBounds(40, 390, 180, 40);
        this.add(btDomingo);


        
    }

    
}
