package Herencia;

public class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private String fecha_Nac;
    private String sexo;

    public Persona(String ci, String nombre, String apellido, String celular, String fecha_Nac, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
        this.sexo = sexo;
    }

    public void mostrar() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha de Nacimiento: " + fecha_Nac);
        System.out.println("Sexo: " + sexo);
    }

    public int calcularEdad() {
        int añoNac = Integer.parseInt(fecha_Nac.substring(0, 4));
        return 2025 - añoNac;
    }
    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }
}
