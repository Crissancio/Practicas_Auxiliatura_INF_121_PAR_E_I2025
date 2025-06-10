package PERSISTENCIA_DE_OBJETOS.EJER_1;
// b) Clase ArchivoEmpleado con métodos para guardar, buscar y comparar salario
import java.io.*;
import java.util.ArrayList;

public class ArchivoEmpleado {
    private String nomA;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }
    // a) Método para guardar empleados en un archivo
    public void guardarEmpleado(Empleado e) {
        ArrayList<Empleado> lista = leerLista();
        lista.add(e);
        //archivoguard bin
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
            out.writeObject(lista);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    // b) Buscar empleado por nombre
    public Empleado buscaEmpleado(String nombre) {
        for (Empleado e : leerLista()) {
            if (e.nombre.equalsIgnoreCase(nombre)) return e;
        }
        return null;
    }
    // c) Devolver el primer empleado con salario mayor al ingresado
    public Empleado mayorSalario(float s) {
        for (Empleado e : leerLista()) {
            if (e.salario > s) return e;
        }
        return null;
    }
    // Método interno para leer lista de empleados
    private ArrayList<Empleado> leerLista() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
            return (ArrayList<Empleado>) in.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
