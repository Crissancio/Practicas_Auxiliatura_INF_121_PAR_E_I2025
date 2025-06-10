/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppersistencia1;

/**
 *
 * @author Administrador
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoEmpleado {
    private String nomA;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try (ObjectOutputStream arc = new ObjectOutputStream(new FileOutputStream(nomA))) {
            arc.writeObject(new ArrayList<Empleado>());
            System.out.println("Archivo creado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // a) guardarEmpleado
    public void guardarEmpleado(Empleado e) {
        List<Empleado> lista = leerLista();
        lista.add(e);
        escribirLista(lista);
    }

    // b) buscaEmpleado
    public Empleado buscaEmpleado(String nombre) {
        List<Empleado> lista = leerLista();
        for (Empleado e : lista) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    // c) mayorSalario
    public Empleado mayorSalario(float sueldo) {
        List<Empleado> lista = leerLista();
        for (Empleado e : lista) {
            if (e.getSalario() > sueldo) {
                return e;
            }
        }
        return null;
    }

    // Métodos auxiliares para serialización
    private List<Empleado> leerLista() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (List<Empleado>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private void escribirLista(List<Empleado> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
