package HERENCIA.EJERCICIO_3;

import java.time.LocalDate;

public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    public Docente() {
        super();
        this.nit = "NIT000";
        this.profesion = "Profesor";
        this.especialidad = "General";
        this.sexo = "M";
    }

    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Sexo: " + sexo);
    }
}
