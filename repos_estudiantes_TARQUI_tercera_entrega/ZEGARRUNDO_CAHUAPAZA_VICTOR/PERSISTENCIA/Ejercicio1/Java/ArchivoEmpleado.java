package Ejercicio1;

import java.io.*;
import java.util.ArrayList;

public class ArchivoEmpleado {
    private String nomA;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }

    public void guardarEmpleado(Empleado e) {
        ArrayList<Empleado> empleados = leerEmpleados();
        empleados.add(e);
        escribirEmpleados(empleados);
    }

    public Empleado buscaEmpleado(String nombre) {
        ArrayList<Empleado> empleados = leerEmpleados();
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        ArrayList<Empleado> empleados = leerEmpleados();
        for (Empleado e : empleados) {
            if (e.getSalario() > sueldo) {
                return e;
            }
        }
        return null;
    }

    private ArrayList<Empleado> leerEmpleados() {
        ArrayList<Empleado> lista = new ArrayList<>();
        File archivo = new File(nomA);
        if (!archivo.exists() || archivo.length() == 0) {
            return lista;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
            lista = (ArrayList<Empleado>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer empleados: " + e.getMessage());
        }
        return lista;
    }

    private void escribirEmpleados(ArrayList<Empleado> empleados) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
            out.writeObject(empleados);
        } catch (IOException e) {
            System.out.println("Error al escribir empleados: " + e.getMessage());
        }
    }
}