import java.time.LocalDate;

class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;

    // Constructor por defecto
    public Docente() {
        super();
        this.nit = "0000000";
        this.profesion = "Sin profesión";
        this.especialidad = "Sin especialidad";
    }

    // Constructor completo
    public Docente(String ci, String nombre, String apellido, String celular, 
                  LocalDate fechaNac, char sexo, String nit, 
                  String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    // Getters y Setters
    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }
    public String getProfesion() { return profesion; }
    public void setProfesion(String profesion) { this.profesion = profesion; }
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("----------------------------");
    }
}
