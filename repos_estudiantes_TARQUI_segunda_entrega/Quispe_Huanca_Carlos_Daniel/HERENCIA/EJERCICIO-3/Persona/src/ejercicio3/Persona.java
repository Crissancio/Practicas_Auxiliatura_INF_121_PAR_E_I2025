package ejercicio3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    protected String ci;
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected String fechaNac;
    protected String sexo;
    
    public Persona() {
        this("", "", "", "", "2000-01-01", "");
    }
    
    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }
    
    public int calcularEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNac, formatter);
        LocalDate ahora = LocalDate.now();
        return Period.between(fechaNacimiento, ahora).getYears();
    }
    
    public void mostrar() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha Nacimiento: " + fechaNac);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + calcularEdad() + " años");
    }
    
    public String getCi() { return ci; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCelular() { return celular; }
    public String getFechaNac() { return fechaNac; }
    public String getSexo() { return sexo; }
    
    public void setCi(String ci) { this.ci = ci; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setCelular(String celular) { this.celular = celular; }
    public void setFechaNac(String fechaNac) { this.fechaNac = fechaNac; }
    public void setSexo(String sexo) { this.sexo = sexo; }
}