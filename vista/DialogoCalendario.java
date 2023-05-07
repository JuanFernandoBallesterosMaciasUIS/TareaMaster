package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoCalendario extends JDialog {

    //----------------------
    // Atributos
    //----------------------
    
    private JButton btMesAnterior;
    private JButton btMesSiguiente;

    //----------------------
    // Metodos
    //----------------------
    public DialogoCalendario()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Creación del botón del mes anterior
        btMesAnterior = new JButton("Mes anterior");
        btMesAnterior.setBounds(10, 10, 50, 50);
        this.add(btMesAnterior);

        //Creación del botón del mes siguiente
        btMesSiguiente = new JButton("Mes siguiente");
        btMesSiguiente.setBounds(240, 10, 50, 50);
        this.add(btMesSiguiente);




        //Caracteristicas de la ventana
        this.setTitle("Calendario");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
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

    public void cerrarDialogoAgregarVendedor()
    {
        this.dispose();
    }
}

    

