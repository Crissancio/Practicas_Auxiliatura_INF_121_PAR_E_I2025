package H_2;

public class Docente extends Persona {
    private String nit, profesion, especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, int[] fechaNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + ", Profesión: " + profesion + ", Especialidad: " + especialidad);
    }

    public String getProfesion() {
        return profesion;
    }
}
