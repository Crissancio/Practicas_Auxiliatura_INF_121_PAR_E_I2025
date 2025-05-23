
package ejercicio2;
import java.time.LocalDate;

public class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private LocalDate fechaNac;

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public Persona() {
        this("0", "SinNombre", "SinApellido", "00000000", LocalDate.of(2000, 1, 1));
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fechaNac.getYear();
    }

    public String getApellido() { return apellido; }
    public LocalDate getFechaNac() { return fechaNac; }
    public String getNombre() { return nombre; }

    public void mostrar() {
        System.out.println("CI: " + ci + ", Nombre: " + nombre + " " + apellido + ", Celular: " + celular + ", Fecha Nac: " + fechaNac);
    }
}