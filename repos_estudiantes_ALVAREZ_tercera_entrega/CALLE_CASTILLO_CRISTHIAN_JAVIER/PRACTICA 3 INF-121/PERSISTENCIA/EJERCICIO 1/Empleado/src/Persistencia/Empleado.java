package Persistencia;

import java.io.*;

class Empleado implements Serializable {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado[nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }
}
