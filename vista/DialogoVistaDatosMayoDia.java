package vista;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class DialogoVistaDatosMayoDia extends JPanel {
    // Atributos
    private JTabbedPane tabbedPane;
    private DialogoDiasCategorias diasCategorias1;
    private DialogoDiasCategorias diasCategorias2;
    private DialogoDiasCategorias diasCategorias3;
    private DialogoDiasCategorias diasCategorias4;
    private DialogoDiasCategorias diasCategorias5;
    private DialogoDiasCategorias diasCategorias6;


    public DialogoVistaDatosMayoDia() {
        //Definición del layout del Dialogo
        this.setLayout(new BorderLayout());

        // Crear instancias de diasCategorias
        diasCategorias1 = new DialogoDiasCategorias();
        diasCategorias2 = new DialogoDiasCategorias();
        diasCategorias3 = new DialogoDiasCategorias();
        diasCategorias4 = new DialogoDiasCategorias();
        diasCategorias5 = new DialogoDiasCategorias();
        diasCategorias6 = new DialogoDiasCategorias();

        // Crear y agregar JTabbedPane
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Categoria 1", null, diasCategorias1, "Información de las tareas");
        tabbedPane.addTab("Categoria 2", null, diasCategorias2, "Información de las tareas");
        tabbedPane.addTab("Categoria 3", null, diasCategorias3, "Información de las tareas");
        tabbedPane.addTab("Categoria 4", null, diasCategorias4, "Información de las tareas");
        tabbedPane.addTab("Categoria 5", null, diasCategorias5, "Información de las tareas");
        tabbedPane.addTab("Categoria 6", null, diasCategorias6, "Información de las tareas");

        this.add(tabbedPane, BorderLayout.CENTER);
    }
}