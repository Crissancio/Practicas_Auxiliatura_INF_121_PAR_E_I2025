import java.time.LocalDate;

class Docente extends Persona {
    public String nit, profesion, especialidad;
    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo,
                   String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Profesión: " + profesion + ", Especialidad: " + especialidad);
    }
    public String getProfesion() {
        return profesion;
    }
}