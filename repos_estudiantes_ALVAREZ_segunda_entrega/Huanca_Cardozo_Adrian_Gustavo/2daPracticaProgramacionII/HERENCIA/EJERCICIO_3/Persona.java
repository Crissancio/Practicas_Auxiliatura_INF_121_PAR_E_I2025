package HERENCIA.EJERCICIO_3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNac;

    public Persona() {
        this.ci = "0000";
        this.nombre = "Nombre";
        this.apellido = "Apellido";
        this.celular = "00000000";
        this.fechaNac = LocalDate.of(2000, 1, 1);
    }

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public void mostrar() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha de Nacimiento: " + fechaNac);
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public String getApellido() {
        return apellido;
    }
}
