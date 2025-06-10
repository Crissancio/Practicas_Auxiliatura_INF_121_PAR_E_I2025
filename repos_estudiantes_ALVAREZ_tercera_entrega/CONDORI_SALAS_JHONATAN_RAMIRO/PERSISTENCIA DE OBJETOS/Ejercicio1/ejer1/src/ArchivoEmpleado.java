import java.io.*;
import java.util.ArrayList;
public class ArchivoEmpleado {
    private String nomA;
    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }
    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(new ArrayList<Empleado>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarEmpleado(Empleado e) {
        ArrayList<Empleado> empleados = leerArchivo();
        empleados.add(e);
        escribirArchivo(empleados);
    }
    public Empleado buscaEmpleado(String nombre) {
        ArrayList<Empleado> empleados = leerArchivo();
        for (Empleado e : empleados) {
            if (e.getNombre().equals(nombre)) {
                return e;
            }
        }
        return null;
    }
    public Empleado mayorSalario(double salario) {
        ArrayList<Empleado> empleados = leerArchivo();
        for (Empleado e : empleados) {
            if (e.getSalario() > salario) {
                return e;
            }
        }
        return null;
    }
    private ArrayList<Empleado> leerArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (ArrayList<Empleado>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
    private void escribirArchivo(ArrayList<Empleado> empleados) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}