/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persistencia;

/**
 *
 * @author USUARIO
 */
import java.io.*;
import java.util.ArrayList;

class Empleado implements Serializable {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
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
            System.out.println("📁 Archivo creado correctamente.");
        } catch (IOException e) {
            System.out.println("❌ Error al crear el archivo: " + e.getMessage());
        }
    }

    public void guardarEmpleado(Empleado e) {
        ArrayList<Empleado> empleados = leerEmpleados();
        empleados.add(e);
        escribirEmpleados(empleados);
    }

    public Empleado buscaEmpleado(String nombre) {
        ArrayList<Empleado> empleados = leerEmpleados();
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float s) {
        ArrayList<Empleado> empleados = leerEmpleados();
        for (Empleado e : empleados) {
            if (e.getSalario() > s) {
                return e;
            }
        }
        return null;
    }

    private ArrayList<Empleado> leerEmpleados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (ArrayList<Empleado>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private void escribirEmpleados(ArrayList<Empleado> empleados) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            System.out.println("❌ Error al guardar empleados: " + e.getMessage());
        }
    }
}

public class Persistencia {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");
        archivo.crearArchivo();

        archivo.guardarEmpleado(new Empleado("Juan", 30, 3500.0f));
        archivo.guardarEmpleado(new Empleado("Ana", 25, 4200.5f));
        archivo.guardarEmpleado(new Empleado("Luis", 40, 5000.0f));

        Empleado buscado = archivo.buscaEmpleado("Ana");
        System.out.println("🔍 Empleado buscado: " + buscado);

        Empleado mejorPago = archivo.mayorSalario(4000.0f);
        System.out.println("💰 Primer empleado con sueldo mayor a 4000: " + mejorPago);
    }
}
