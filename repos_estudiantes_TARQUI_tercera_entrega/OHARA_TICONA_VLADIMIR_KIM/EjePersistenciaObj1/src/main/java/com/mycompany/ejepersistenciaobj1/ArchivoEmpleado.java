package com.mycompany.ejepersistenciaobj1;
/**
 *
 * @author Usuario
 */
import java.io.*;
import java.util.*;
public class ArchivoEmpleado {
private String nomA;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() throws IOException {
        FileOutputStream fos = new FileOutputStream(nomA);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new ArrayList<Empleado>());
        oos.close();
    }

    public void guardarEmpleado(Empleado e) throws IOException, ClassNotFoundException {
        List<Empleado> lista = leerEmpleados();
        lista.add(e);
        guardarLista(lista);
    }

    public Empleado buscaEmpleado(String nombre) throws IOException, ClassNotFoundException {
        for (Empleado e : leerEmpleados()) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) throws IOException, ClassNotFoundException {
        for (Empleado e : leerEmpleados()) {
            if (e.getSalario() > sueldo) {
                return e;
            }
        }
        return null;
    }

    private List<Empleado> leerEmpleados() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(nomA);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Empleado> lista = (List<Empleado>) ois.readObject();
        ois.close();
        return lista;
    }

    private void guardarLista(List<Empleado> lista) throws IOException {
        FileOutputStream fos = new FileOutputStream(nomA);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(lista);
        oos.close();
    }
}
