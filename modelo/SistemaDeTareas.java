package modelo;

import java.io.*;

public class SistemaDeTareas {
    private ListaDeTareas listaDeTareas;
    private static final String FILE_NAME = "tareas.ser";

    public SistemaDeTareas() {
        listaDeTareas = cargarTareas();
    }

    // Métodos para interactuar con ListaDeTareas

    public void guardarTareas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(listaDeTareas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ListaDeTareas cargarTareas() {
        ListaDeTareas lista = null;
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                lista = (ListaDeTareas) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            lista = new ListaDeTareas();
        }
        return lista;
    }
}
