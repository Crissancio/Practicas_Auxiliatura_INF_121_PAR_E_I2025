package PERSISTENCIA_DE_OBJETOS.EJERCICIO_1;
import java.io.*;
import java.util.ArrayList;

public class ArchivoEmpleado {
    private String nomA;
    private ArrayList<Empleado> listaEmpleados;

    public ArchivoEmpleado(String n) {
        nomA = n;
        listaEmpleados = cargarArchivo();
    }

    public void crearArchivo() {
        listaEmpleados = new ArrayList<>();
        guardarArchivo();
    }

    public void guardarEmpleado(Empleado e) {
        listaEmpleados.add(e);
        guardarArchivo();
    }

    public Empleado buscaEmpleado(String n) {
        for (Empleado e : listaEmpleados) {
            if (e.getNombre().equalsIgnoreCase(n)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        for (Empleado e : listaEmpleados) {
            if (e.getSalario() > sueldo) {
                return e;
            }
        }
        return null;
    }

    private void guardarArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
            out.writeObject(listaEmpleados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private ArrayList<Empleado> cargarArchivo() {
        File f = new File(nomA);
        if (!f.exists()) return new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
            return (ArrayList<Empleado>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
