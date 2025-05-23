package HERENCIA.EJER_3;
import java.time.LocalDate;
public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    public Docente(String ci, String nombre, String apellido, String celular, 
                  LocalDate fechaNac, String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesion: " + profesion);
        System.out.println("Especialidad: " + especialidad);
    }
    public String getProfesion() {
        return profesion;
    }
}