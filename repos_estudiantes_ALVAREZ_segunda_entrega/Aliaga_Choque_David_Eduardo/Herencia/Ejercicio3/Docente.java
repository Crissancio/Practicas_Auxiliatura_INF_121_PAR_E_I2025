public class Docente extends Persona {
    public String nit;
    public String profesion;
    public String especialidad;
    public String sexo;

    public Docente(String ci, String nombre, String apellido, String celular, String fechaNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Docente: " + super.toString() + ", NIT: " + nit + ", Profesion: " + profesion + ", Especialidad: " + especialidad + ", Sexo: " + sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getSexo() {
        return sexo;
    }

    public String getApellido() {
        return apellido;
    }
}

