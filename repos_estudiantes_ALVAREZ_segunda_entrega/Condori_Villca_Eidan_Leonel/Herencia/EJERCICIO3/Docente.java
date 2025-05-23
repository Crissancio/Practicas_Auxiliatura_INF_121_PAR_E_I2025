package Herencia;

public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, String fecha_Nac, String sexo,String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fecha_Nac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }


    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("--------------------------");
    }

    public String getProfesion() {
        return profesion;
    }
}
