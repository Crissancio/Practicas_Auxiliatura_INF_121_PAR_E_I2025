import java.time.LocalDate;
import java.time.Period;

class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNacimiento; 
    public Persona() {
        this.ci = "0000000";
        this.nombre = "Sin Nombre";
        this.apellido = "Sin Apellido";
        this.celular = "00000000";
        this.fechaNacimiento = LocalDate.of(2000, 1, 1); // Default to Jan 1, 2000
    }

    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNacimiento) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public void mostrar() {
        System.out.println(" Datos de Persona ");
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Edad: " + getEdad() + " años");
    }

    public String getCi() { return ci; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCelular() { return celular; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }

    public void setCi(String ci) { this.ci = ci; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setCelular(String celular) { this.celular = celular; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getProfesion() { return null; }
    public String getSexo() { return null; }
}
