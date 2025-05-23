package Herencia.ejercicio3.java;

import java.time.LocalDate;
import java.time.Period;

class Persona {
    String ci, nombre, apellido, celular;
    LocalDate fechaNac;

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public void mostrar() {
        System.out.println(nombre + " " + apellido + ", CI: " + ci + ", Edad: " + getEdad());
    }

    public String getApellido() {
        return apellido;
    }
}
