import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoEmpleado {
    private String nomA;
    private List<Empleado> empleados;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
        this.empleados = new ArrayList<>();
        crearArchivo();
    }

    public void crearArchivo() {
        File file = new File(nomA);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Error al crear el archivo: " + e.getMessage());
            }
        }
    }

    // a) Implementación de guardarEmpleado
    public void guardarEmpleado(Empleado e) {
        empleados.add(e);
        guardarEnArchivo();
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            System.err.println("Error al guardar empleados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void cargarEmpleados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            empleados = (List<Empleado>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar empleados: " + e.getMessage());
            empleados = new ArrayList<>();
        }
    }

    // b) Implementación de buscaEmpleado
    public Empleado buscaEmpleado(String n) {
        cargarEmpleados();
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(n)) {
                return emp;
            }
        }
        return null;
    }

    // c) Implementación de mayorSalario
    public Empleado mayorSalario(float sueldo) {
        cargarEmpleados();
        for (Empleado emp : empleados) {
            if (emp.getSalario() > sueldo) {
                return emp;
            }
        }
        return null;
    }
}
