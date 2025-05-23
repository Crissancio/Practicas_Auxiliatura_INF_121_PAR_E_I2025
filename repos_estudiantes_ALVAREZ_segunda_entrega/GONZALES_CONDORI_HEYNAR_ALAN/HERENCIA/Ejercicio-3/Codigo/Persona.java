
package Ejercicio03;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNac;

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
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha de nacimiento: " + fechaNac + " (Edad: " + getEdad() + ")");
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
}

