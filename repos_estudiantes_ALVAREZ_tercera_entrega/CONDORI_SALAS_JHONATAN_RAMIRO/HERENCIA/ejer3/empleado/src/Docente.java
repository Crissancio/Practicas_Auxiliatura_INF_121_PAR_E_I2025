import java.time.LocalDate;
public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;
    public Docente() {
        this("0", "Nombre", "Apellido", "0000000", LocalDate.of(1980, 1, 1), 
             "NIT000", "Profesión", "Especialidad", "Masculino");
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
        System.out.println("NIT: " + nit + " | Profesión: " + profesion +
                " | Especialidad: " + especialidad + " | Sexo: " + sexo + "\n");
    }
}