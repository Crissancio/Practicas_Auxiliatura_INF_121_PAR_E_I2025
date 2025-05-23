package Ejercicio1_H;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
public class Persona {
    String ci, nombre, apellido, celular, fechaNac;

    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + ", CI: " + ci + ", Celular: " + celular + ", Nac: " + fechaNac);
    }

    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = LocalDate.parse(fechaNac);
        return Period.between(nacimiento, hoy).getYears();
    }
}