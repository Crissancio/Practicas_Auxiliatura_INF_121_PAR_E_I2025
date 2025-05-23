package estudiantejava;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected String fecha_Nac;
    protected String sexo;

    // Constructor por defecto
    public Persona() {
        this.ci = "Sin CI";
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.celular = "Sin celular";
        this.fecha_Nac = "01/01/2000";
        this.sexo = "No especificado";
    }

    // Constructor con parámetros
    public Persona(String ci, String nombre, String apellido, String celular, String fecha_Nac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
        this.sexo = sexo;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha Nacimiento: " + fecha_Nac);
        System.out.println("Sexo: " + sexo);
    }

    // Método para calcular la edad
    public int calcularEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fecha_Nac, formatter);
        LocalDate ahora = LocalDate.now();
        return Period.between(fechaNac, ahora).getYears();
    }
}