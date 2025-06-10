package Ejercicio1;

import java.io.*;
import java.util.ArrayList;

public class ArchivoEmpleado {
    private String nomA;

    public ArchivoEmpleado(String n) {
        this.nomA = n;
    }

    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(new ArrayList<Empleado>());
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    // a) Implementa el método guardarEmpleado(Empleado e) para almacenar empleados.
    public void guardarEmpleado(Empleado e) {
        ArrayList<Empleado> lista = leerArchivo();
        lista.add(e);
        escribirArchivo(lista);
    }

    // b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos
    // del Empleado n.
    public Empleado buscaEmpleado(String n) {
        ArrayList<Empleado> lista = leerArchivo();
        for (Empleado e : lista) {
            if (e.getNombre().equalsIgnoreCase(n)) {
                return e;
            }
        }
        return null;
    }

    // c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con
    // sueldo mayor al ingresado.
    public Empleado mayorSalario(float s) {
        ArrayList<Empleado> lista = leerArchivo();
        for (Empleado e : lista) {
            if (e.getSalario() > s) {
                return e;
            }
        }
        return null;
    }

    private ArrayList<Empleado> leerArchivo() {
        ArrayList<Empleado> lista = new ArrayList<>();
        File f = new File(nomA);
        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
                lista = (ArrayList<Empleado>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        }
        return lista;
    }

    private void escribirArchivo(ArrayList<Empleado> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
