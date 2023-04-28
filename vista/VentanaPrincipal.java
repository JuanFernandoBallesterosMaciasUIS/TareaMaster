package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    // Atributos


    // Constructor de la clase
public VentanaPrincipal() {

    // Establecemos el layout de la ventana a null
    this.setLayout(null);

    // Configuramos la ventana con un título "Sistema de Tareas",
    // un tamaño de 800x600 píxeles, la acción que realiza al cerrar,
    // su posición central en la pantalla y la hacemos visible.

    this.setTitle("Sistema de Tareas");
    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setVisible(true);

    }
}

// La clase VentanaPrincipal representa una ventana de interfaz gráfica de usuario (GUI) que utiliza la clase JFrame para su construcción. El constructor de la clase establece el diseño de la ventana a null y configura las características de la ventana, como su título, tamaño, posición, etc. para que se adapte al diseño deseado.