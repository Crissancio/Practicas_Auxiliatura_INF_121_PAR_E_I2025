import java.time.LocalDate;
import java.time.Period;

class Persona {
    public String ci, nombre, apellido, celular, sexo;
    public LocalDate fechaNac;
    public Persona(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }
    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }
    public void mostrar() {
        System.out.println(nombre + " " + apellido + ", CI: " + ci + ", Edad: " + getEdad());
    }
    public String getApellido() {
        return apellido;
    }
    public String getSexo() {
        return sexo;
    }
}