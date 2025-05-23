package ejercicio3;

// Docente (hereda de Persona) <nit, profesión, especialidad>

public class Docente extends Persona {
    // a) Atributos específicos de Docente
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    // a) Constructor por defecto
    public Docente() {
        super();
        this.nit = "";
        this.profesion = "";
        this.especialidad = "";
        this.sexo = "";
    }

    // a) Constructor con parámetros
    public Docente(String ci, String nombre, String apellido, String celular, String fechaNac,
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

    // b) Método mostrar()
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.printf("NIT: %s, Profesión: %s, Especialidad: %s, Sexo: %s\n", nit, profesion, especialidad, sexo);
    }
}
