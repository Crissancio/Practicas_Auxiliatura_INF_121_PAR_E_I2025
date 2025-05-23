package HERENCIA.EJER_3;
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
    public void mostrar() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha Nacimiento: " + fechaNac);
    }
    public int calcularEdad() {
        return LocalDate.now().getYear() - fechaNac.getYear();
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }
}