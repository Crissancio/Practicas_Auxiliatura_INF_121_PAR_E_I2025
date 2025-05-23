import java.time.LocalDate;
import java.time.Period;

public class Persona {
    protected String ci, nombre, apellido, celular;
    protected LocalDate fechaNac;

    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = LocalDate.parse(fechaNac);
    }

    public void mostrar() {
        System.out.println("CI: " + ci + ", Nombre: " + nombre + " " + apellido +
                ", Celular: " + celular + ", Fecha Nac: " + fechaNac);
    }

    public int edad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    public String getApellido() {
        return apellido;
    }
}
