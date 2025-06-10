import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoEmpleado {
    private String nomA;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
        this.crearArchivo(); 
        this.cargarEmpleados();
    }

    public void crearArchivo() {
        File archivo = new File(nomA);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void cargarEmpleados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            empleados = (ArrayList<Empleado>) ois.readObject();
        } catch (Exception e) {
            empleados = new ArrayList<>(); 
        }
    }

    private void guardarEmpleadosEnArchivo() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(empleados);
        }
    }

    public void guardarEmpleado(Empleado e) throws IOException {
        empleados.add(e);
        guardarEmpleadosEnArchivo();
    }

    public Empleado buscaEmpleado(String n) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(n)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        for (Empleado e : empleados) {
            if (e.getSalario() > sueldo) {
                return e;
            }
        }
        return null;
    }
}
