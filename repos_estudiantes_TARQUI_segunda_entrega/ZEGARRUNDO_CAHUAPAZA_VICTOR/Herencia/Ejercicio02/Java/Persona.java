package Herencia2;

public class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private int celular;
    private int anioNac;

    public Persona(String ci, String nombre, String apellido, int celular, int anioNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.anioNac = anioNac;
    }

    public void mostrarInfo() {
        System.out.println("CI: " + ci + ", Nombre: " + nombre + " " + apellido +
                ", Celular: " + celular + ", Año Nacimiento: " + anioNac);
    }

    public int calcularEdad(int anioActual) {
        return anioActual - anioNac;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
}
