
package ejercicio2;


import java.time.LocalDate;

public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    public Docente() {
        super();
        this.nit = "000";
        this.profesion = "Desconocida";
        this.especialidad = "General";
        this.sexo = "M";
    }

    public String getProfesion() { return profesion; }
    public String getSexo() { return sexo; }

    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + ", Profesion: " + profesion + ", Especialidad: " + especialidad + ", Sexo: " + sexo);
    }
}
