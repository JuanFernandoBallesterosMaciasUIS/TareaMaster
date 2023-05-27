package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoJunio extends JPanel {

    //----------------------
    // Atributos
    //----------------------
    
    private JButton btMesAnterior;
    private JButton btMesSiguiente;
    private JTextArea tareasSinHacer;
    
    //----------------------
    // Metodos
    //----------------------
    public DialogoJunio()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar area de texto con un borde llamado Tareas no realizadas
        tareasSinHacer = new JTextArea();
        tareasSinHacer.setBounds(30, 90, 200, 300);
        tareasSinHacer.setBorder(BorderFactory.createTitledBorder("Tareas no realizadas"));
        tareasSinHacer.setBackground(Color.decode("#D4D7E9"));
        this.add(tareasSinHacer);

        //Creación del botón del mes anterior
        btMesAnterior = new JButton("Mes anterior");
        // btMesAnterior.setBackground(Color.decode("#D4D7E9"));
        btMesAnterior.setFont(new Font("Verdana", Font.BOLD, 12));
        btMesAnterior.setBounds(320, 500, 130, 20);
        this.add(btMesAnterior);

        //Creación del botón del mes siguiente
        btMesSiguiente = new JButton("Mes siguiente");
        // se agrega color a la letra
        btMesSiguiente.setBackground(Color.decode("#D4D7E9"));
        btMesSiguiente.setFont(new Font("Verdana", Font.BOLD, 12));
        btMesSiguiente.setBounds(920, 500, 130, 20);
        this.add(btMesSiguiente);
        
        // Creacion del calendario como una matriz de botones que cada boton muestre el numero del dia hasta 31 botones
        JButton[] calendario = new JButton[30];
        int x = 0;
        int y = 0;
        for (int dia = 0; dia < calendario.length; dia++) 
        {
            calendario[dia] = new JButton();
            calendario[dia].setBounds(250 + x, 90 + y, 120, 80);
            calendario[dia].setText("" + (dia + 1));
            calendario[dia].setHorizontalAlignment(SwingConstants.LEFT); // Alineación horizontal
            calendario[dia].setVerticalAlignment(SwingConstants.TOP); // Alineación vertical
            calendario[dia].addActionListener(new ActionListener() {
                // Mostrar ventana al hacer clic en el botón
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarVentana();
                }
            });
            this.add(calendario[dia]);// Ventanas de cada día del calendario
        
            x += 120;
            if ((dia + 1) % 7 == 0) // al llegar a 7 botones, iniciar una nueva línea
            {
                x = 0;
                y += 80;
            }
        }

        // Creacion de los labels de los dias de la semana 
        JLabel[] diasSemana = new JLabel[7];
        diasSemana[0] = new JLabel("Lunes");
        diasSemana[1] = new JLabel("Martes");
        diasSemana[2] = new JLabel("Miércoles");
        diasSemana[3] = new JLabel("Jueves");
        diasSemana[4] = new JLabel("Viernes");
        diasSemana[5] = new JLabel("Sábado");
        diasSemana[6] = new JLabel("Domingo");
        diasSemana[0].setBounds(250, 70, 120, 20);
        diasSemana[1].setBounds(370, 70, 120, 20);
        diasSemana[2].setBounds(490, 70, 120, 20);
        diasSemana[3].setBounds(610, 70, 120, 20);
        diasSemana[4].setBounds(730, 70, 120, 20);
        diasSemana[5].setBounds(850, 70, 120, 20);
        diasSemana[6].setBounds(970, 70, 120, 20);
        this.add(diasSemana[0]);
        this.add(diasSemana[1]);
        this.add(diasSemana[2]);
        this.add(diasSemana[3]);
        this.add(diasSemana[4]);
        this.add(diasSemana[5]);
        this.add(diasSemana[6]);

        // Creacion del label del mes de Junio 
        JLabel mes = new JLabel("- Junio -"); // Creación del label
        mes.setBounds(500, 20, 120, 40); // Ajusta la posición del label
        // Ajusta el tamaño de la fuente
        mes.setFont(new Font("Arial", Font.PLAIN, 30));
        this.add(mes); // Agrega el label a la ventana

        //Caracteristicas de la ventana , nombre , tamaño , posicion , no redimensionable y visible
        this.setSize(1150,570);
        this.setVisible(true);
        
    }

    private void mostrarVentana() {
        JDialog ventana = new JDialog();
        ventana.setTitle("Ventana de botón");
        ventana.setSize(600, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        ventana.setVisible(true);

        // Mostrar el DialogoVistaDatosDia
        DialogoVistaDatosJunioDia dialogo = new DialogoVistaDatosJunioDia();
        ventana.add(dialogo);


    }

    //Metodos de acceso

    public JButton getBtMesAnterior() 
    {
        return btMesAnterior;
    }

    public JButton getBtMesSiguiente() 
    {
        return btMesSiguiente;
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btMesAnterior.addActionListener(pAL);
    }

    public void agregarOyenteBoton2(ActionListener pAL)
    {
        btMesSiguiente.addActionListener(pAL);
    }
}

    

