package PERSISTENCIA.Ejercicio1.Java;

import java.io.*;
import java.util.ArrayList;

public class GestorEmpleado {
    private final String archivo = "empleados.dat";

    public void guardarEmpleado(Empleado e) {
        ArrayList<Empleado> lista = leerTodos();
        lista.add(e);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(lista);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Empleado> leerTodos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Empleado>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public Empleado buscaEmpleado(String nombre) {
        for (Empleado e : leerTodos()) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        for (Empleado e : leerTodos()) {
            if (e.getSalario() > sueldo) {
                return e;
            }
        }
        return null;
    }
}
