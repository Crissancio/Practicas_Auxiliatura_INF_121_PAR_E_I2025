import java.time.LocalDate;
import java.time.Period;
public class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNac;
    public Persona() {
        this("0", "Nombre", "Apellido", "0000000", LocalDate.of(2000, 1, 1));
    }
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
        System.out.println("CI: " + ci + " | Nombre: " + nombre + " " + apellido +
                " | Celular: " + celular + " | Fecha Nac: " + fechaNac + " | Edad: " + getEdad());
    }
    public String getApellido() {
        return apellido;
    }
}