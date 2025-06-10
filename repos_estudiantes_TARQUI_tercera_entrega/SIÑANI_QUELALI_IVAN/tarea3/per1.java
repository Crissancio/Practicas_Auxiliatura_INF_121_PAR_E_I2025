import java.io.Serializable;
//empleado
public class Empleado implements Serializable {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public float getSalario() { return salario; }

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Edad: " + edad + ", Salario: " + salario;
    }
}
//------------------------------------------------------------------------------------
//archivo empleado
import java.io.*;
import java.util.ArrayList;
import java.util.List;
//gestionar empleados en un archivo
public class ArchivoEmpleado {
    private String nomArchivo;

    // Constructor
    public ArchivoEmpleado(String nomArchivo) {
        this.nomArchivo = nomArchivo;
    public void crearArchivo() {
        try {
            File file = new File(nomArchivo);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }
    public void guardarEmpleado(Empleado empleado) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomArchivo, true))) {
            oos.writeObject(empleado);
        } catch (IOException e) {
            System.out.println("Error al guardar empleado: " + e.getMessage());
        }
    }
    public Empleado buscaEmpleado(String nombre) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomArchivo))) {
            while (true) {
                Empleado empleado = (Empleado) ois.readObject();
                if (empleado.getNombre().equals(nombre)) {
                    return empleado;
                }
            }
        } catch (EOFException e) {
            return null; 
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al buscar empleado: " + e.getMessage());
        }
        return null;
    }
    public Empleado mayorSalario(float sueldo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomArchivo))) {
            while (true) {
                Empleado empleado = (Empleado) ois.readObject();
                if (empleado.getSalario() > sueldo) {
                    return empleado;
                }
            }
        } catch (EOFException e) {
            return null;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al buscar salario mayor: " + e.getMessage());
        }
        return null;
    }
}
//-------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");
        archivo.crearArchivo();
        // Guardar
        archivo.guardarEmpleado(new Empleado("Juan", 30, 2500.50f));
        archivo.guardarEmpleado(new Empleado("Ana", 28, 3200.00f));
        archivo.guardarEmpleado(new Empleado("Carlos", 35, 2800.75f));
        // Buscarnombre
        Empleado encontrado = archivo.buscaEmpleado("Ana");
        System.out.println("Empleado encontrado: " + encontrado);
        // Buscar empleado con salario mayor a 2600
        Empleado mayorSalario = archivo.mayorSalario(2600);
        System.out.println("Empleado con salario mayor a 2600: " + mayorSalario);
    }
}
