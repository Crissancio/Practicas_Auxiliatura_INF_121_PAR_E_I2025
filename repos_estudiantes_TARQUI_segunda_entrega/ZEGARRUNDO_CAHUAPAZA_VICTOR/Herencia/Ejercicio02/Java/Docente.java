package Herencia2;

public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;

    public Docente(String ci, String nombre, String apellido, int celular, int anioNac,
                   String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, anioNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("NIT: " + nit + ", Profesión: " + profesion + ", Especialidad: " + especialidad);
    }

    public String getProfesion() {
        return profesion;
    }
}
