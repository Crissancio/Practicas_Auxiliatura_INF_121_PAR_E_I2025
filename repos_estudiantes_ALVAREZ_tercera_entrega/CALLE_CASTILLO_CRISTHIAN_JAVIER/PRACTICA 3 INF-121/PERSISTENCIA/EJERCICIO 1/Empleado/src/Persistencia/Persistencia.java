package Persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Persistencia {
    private static final String ARCHIVO = "empleados.dat";

    public static boolean guardarEmpleado(Empleado e) {
        List<Empleado> empleados = cargarEmpleados();
        
        if (empleados == null) {
            empleados = new ArrayList<>();
        }
        
        empleados.add(e);
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(empleados);
            return true;
        } catch (IOException ex) {
            System.err.println("Error al guardar empleado: " + ex.getMessage());
            return false;
        }
    }

    /**
     * Busca un empleado por nombre
     */
    public static Empleado buscarEmpleado(String nombre) {
        List<Empleado> empleados = cargarEmpleados();
        
        if (empleados == null || nombre == null) {
            return null;
        }
        
        for (Empleado emp : empleados) {
            if (nombre.equals(emp.getNombre())) {
                return emp;
            }
        }
        return null;
    }

    public static Empleado mayorSalario(double sueldo) {
        List<Empleado> empleados = cargarEmpleados();
        
        if (empleados == null) {
            return null;
        }
        
        Empleado maximo = null;
        for (Empleado emp : empleados) {
            if (emp.getSueldo() > sueldo) {
                if (maximo == null || emp.getSueldo() > maximo.getSueldo()) {
                    maximo = emp;
                }
            }
        }
        return maximo;
    }

    private static List<Empleado> cargarEmpleados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            return (List<Empleado>) ois.readObject();
        } catch (EOFException | FileNotFoundException e) {
            // El archivo está vacío o no existe
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar empleados: " + e.getMessage());
            return null;
        }
    }
}
