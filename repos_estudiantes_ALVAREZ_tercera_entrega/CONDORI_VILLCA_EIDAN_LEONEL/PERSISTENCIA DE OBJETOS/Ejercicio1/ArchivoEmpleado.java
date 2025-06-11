package Ejercicio1;
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
        ArrayList<Empleado> lista = leerEmpleados();
        lista.add(e);
        escribirEmpleados(lista);
    }

    public Empleado buscaEmpleado(String n) {
        ArrayList<Empleado> lista = leerEmpleados();
        for (int i = 0; i < lista.size(); i++) {
            Empleado e = lista.get(i);
            if (e.getNombre().equalsIgnoreCase(n)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        ArrayList<Empleado> lista = leerEmpleados();
        for (int i = 0; i < lista.size(); i++) {
            Empleado e = lista.get(i);
            if (e.getSalario() > sueldo) {
                return e;
            }
        }
        return null;
    }
    private ArrayList<Empleado> leerEmpleados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (ArrayList<Empleado>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void escribirEmpleados(ArrayList<Empleado> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
