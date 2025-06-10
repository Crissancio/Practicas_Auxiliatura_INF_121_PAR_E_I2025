package ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoEmpleado {
    private String nomA;
    private List<Empleado> empleados;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
        this.empleados = new ArrayList<>();
        
        File file = new File(nomA);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
                empleados = (List<Empleado>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void guardarEmpleado(Empleado e) {
        empleados.add(e);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(empleados);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Empleado buscaEmpleado(String n) {
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(n)) {
                return emp;
            }
        }
        return null;
    }

    public Empleado mayorSalario(double s) {
        for (Empleado emp : empleados) {
            if (emp.getSalario() > s) {
                return emp;
            }
        }
        return null;
    }
}