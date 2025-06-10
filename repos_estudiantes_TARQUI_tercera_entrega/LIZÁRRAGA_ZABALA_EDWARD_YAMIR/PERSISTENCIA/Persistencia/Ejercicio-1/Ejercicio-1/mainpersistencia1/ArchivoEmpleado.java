
package mainpersistencia1;

import java.io.*;
import java.util.ArrayList;

public class ArchivoEmpleado {
    private String nomA;

    // Constructor: + ArchivoEmpleado(n: String)
    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }

    // a) crearArchivo(): sobrescribe el archivo
    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            System.out.println("Archivo creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    // a) guardarEmpleado(Empleado e): almacena empleado sin clase auxiliar
    public void guardarEmpleado(Empleado e) {
        // Leer todos los empleados existentes
        ArrayList<Empleado> empleados = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            while (true) {
                empleados.add((Empleado) ois.readObject());
            }
        } catch (EOFException ignored) {
        } catch (Exception ex) {
            System.out.println("❗ Nota: El archivo estaba vacío o no se pudo leer todo.");
        }

        // Agregar nuevo empleado
        empleados.add(e);

        // Reescribir todo el archivo con los empleados
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            for (Empleado emp : empleados) {
                oos.writeObject(emp);
            }
            System.out.println("Empleado guardado.");
        } catch (IOException ex) {
            System.out.println("Error al guardar empleado: " + ex.getMessage());
        }
    }

    // b) buscaEmpleado(String nombre)
    public Empleado buscaEmpleado(String nombre) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            while (true) {
                Empleado emp = (Empleado) ois.readObject();
                if (emp.getNombre().equalsIgnoreCase(nombre)) {
                    return emp;
                }
            }
        } catch (EOFException e) {
            System.out.println("Empleado no encontrado.");
        } catch (Exception ex) {
            System.out.println("Error al buscar empleado: " + ex.getMessage());
        }
        return null;
    }

    // c) mayorSalario(float s): devuelve primer empleado con sueldo mayor a s
    public Empleado mayorSalario(float s) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            while (true) {
                Empleado emp = (Empleado) ois.readObject();
                if (emp.getSalario() > s) {
                    return emp;
                }
            }
        } catch (EOFException e) {
            System.out.println("No hay empleado con salario mayor.");
        } catch (Exception ex) {
            System.out.println("Error al buscar salario: " + ex.getMessage());
        }
        return null;
    }
}

