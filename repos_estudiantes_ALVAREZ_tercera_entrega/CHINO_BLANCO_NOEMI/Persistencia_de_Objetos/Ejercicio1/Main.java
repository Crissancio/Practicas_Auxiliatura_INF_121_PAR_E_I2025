package Persistencia_de_Objetos.Ejercicio1;


import java.io.*;
import java.util.*;

class Empleado implements Serializable {
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

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setSalario(float salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario;
    }
}

class ArchivoEmpleado {
    private String nomA;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(new ArrayList<Empleado>());
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    public void guardarEmpleado(Empleado e) {
        try {
            List<Empleado> empleados = leerEmpleados();
            empleados.add(e);
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
                oos.writeObject(empleados);
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error al guardar: " + ex.getMessage());
        }
    }

    public Empleado buscaEmpleado(String nombre) {
        try {
            List<Empleado> empleados = leerEmpleados();
            for (Empleado e : empleados) {
                if (e.getNombre().equalsIgnoreCase(nombre)) {
                    return e;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        try {
            List<Empleado> empleados = leerEmpleados();
            for (Empleado e : empleados) {
                if (e.getSalario() > sueldo) {
                    return e;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error al buscar salario: " + ex.getMessage());
        }
        return null;
    }

    private List<Empleado> leerEmpleados() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (List<Empleado>) ois.readObject();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");
        archivo.crearArchivo();

        Empleado e1 = new Empleado("noemi", 25, 3500);
        Empleado e2 = new Empleado("Luis", 30, 4200);
        Empleado e3 = new Empleado("Maria", 28, 2800);

        archivo.guardarEmpleado(e1);
        archivo.guardarEmpleado(e2);
        archivo.guardarEmpleado(e3);

        System.out.println(" Buscar por nombre: noemi");
        Empleado encontrado = archivo.buscaEmpleado("noemi");
        System.out.println(encontrado != null ? encontrado : "No encontrado");

        System.out.println(" Empleado con salario mayor a 3000:");
        Empleado mayorSal = archivo.mayorSalario(3000);
        System.out.println(mayorSal != null ? mayorSal : "Ninguno");
    }
}
