package definir;

import java.util.Date;

public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    public Docente(String ci, String nombre, String apellido, String celular, Date fechaNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + " | Profesión: " + profesion + " | Especialidad: " + especialidad + " | Sexo: " + sexo);
    }

    public String getProfesion() {
        return profesion;
    }

    public String getSexo() {
        return sexo;
    }
}
