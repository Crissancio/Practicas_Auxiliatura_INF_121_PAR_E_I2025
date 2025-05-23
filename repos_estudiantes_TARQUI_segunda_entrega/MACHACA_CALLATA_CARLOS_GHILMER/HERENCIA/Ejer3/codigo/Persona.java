package HERENCIA.Ejer3.codigo;

public class Persona {
    private int ci;
    private String nombre;
    private String apellido;
    private int celular;
    private String fecha_Nac;

    public Persona(int ci, String nombre, String apellido, int celular, String fecha_Nac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
    }

    public int getCi() {
        return ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCelular() {
        return celular;
    }

    public String getFechaNac() {
        return fecha_Nac;
    }

    public void setFechaNac(String fecha_Nac) {
        this.fecha_Nac = fecha_Nac;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarDatos() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha de Nacimiento: " + fecha_Nac);
    }

    
}
