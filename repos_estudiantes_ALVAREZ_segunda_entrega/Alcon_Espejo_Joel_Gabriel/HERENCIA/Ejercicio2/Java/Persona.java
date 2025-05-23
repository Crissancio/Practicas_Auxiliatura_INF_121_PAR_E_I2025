import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected LocalDate fechaNac;
    protected char sexo; // 'M' o 'F'

    // Constructor por defecto
    public Persona() {
        this.ci = "0000000";
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.celular = "00000000";
        this.fechaNac = LocalDate.of(2000, 1, 1);
        this.sexo = 'M';
    }

    // Constructor completo
    public Persona(String ci, String nombre, String apellido, String celular, 
                  LocalDate fechaNac, char sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }

    // Getters y Setters
    public String getCi() { return ci; }
    public void setCi(String ci) { this.ci = ci; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
    public LocalDate getFechaNac() { return fechaNac; }
    public void setFechaNac(LocalDate fechaNac) { this.fechaNac = fechaNac; }
    public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = sexo; }

    // Método para calcular edad
    public int calcularEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    // Método para mostrar información
    public void mostrar() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha Nacimiento: " + fechaNac);
        System.out.println("Sexo: " + (sexo == 'M' ? "Masculino" : "Femenino"));
        System.out.println("Edad: " + calcularEdad() + " años");
    }
}