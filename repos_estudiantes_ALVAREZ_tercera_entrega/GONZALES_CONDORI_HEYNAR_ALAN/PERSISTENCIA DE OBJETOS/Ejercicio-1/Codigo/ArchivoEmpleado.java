package Ejercicio1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoEmpleado {
    private String nomA;  // Nombre del archivo
    private List<Empleado> empleados;  // Relación de agregación con los empleados

    // Constructor
    public ArchivoEmpleado(String n) {
        this.nomA = n;
        this.empleados = new ArrayList<>();
        crearArchivo();  // Se asegura de que el archivo exista
    }

    // Método para crear el archivo si no existe
    public void crearArchivo() {
        try {
            File file = new File(nomA);
            if (!file.exists()) {
                file.createNewFile();  // Crea el archivo si no existe
            } else {
                // Cargar empleados existentes desde el archivo si es necesario
                cargarEmpleados();
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    // Método para guardar un empleado en el archivo (eliminando el modo 'true')
    public void guardarEmpleado(Empleado e) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomA))) {
            out.writeObject(e);  // Escribe el objeto en el archivo
        } catch (IOException ex) {
            System.out.println("Error al guardar empleado: " + ex.getMessage());
        }
    }

    // Método para buscar un empleado por nombre
    public Empleado buscarEmpleado(String nombre) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
            Empleado emp;
            while ((emp = (Empleado) in.readObject()) != null) {
                if (emp.getNombre().equalsIgnoreCase(nombre)) {
                    return emp;  // Retorna el empleado encontrado
                }
            }
        } catch (EOFException e) {
            // Fin del archivo, no se encontró el empleado
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al buscar empleado: " + e.getMessage());
        }
        return null;  // Retorna null si no encuentra el empleado
    }

    // Método para buscar el primer empleado con salario mayor al especificado
    public Empleado mayorSalario(float sueldo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
            Empleado emp;
            while ((emp = (Empleado) in.readObject()) != null) {
                if (emp.getSalario() > sueldo) {
                    return emp;  // Retorna el primer empleado con salario mayor
                }
            }
        } catch (EOFException e) {
            // Fin del archivo, no se encontró el empleado
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al buscar empleado con mayor salario: " + e.getMessage());
        }
        return null;  // Retorna null si no encuentra ningún empleado con salario mayor
    }

    // Método para cargar empleados desde el archivo
    private void cargarEmpleados() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomA))) {
            Empleado emp;
            while ((emp = (Empleado) in.readObject()) != null) {
                empleados.add(emp);  // Los agrega a la lista de empleados
            }
        } catch (EOFException e) {
            // Fin del archivo
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar empleados: " + e.getMessage());
        }
    }
}
