import java.time.LocalDate;

class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo; 
    public Docente() {
        super(); 
        this.nit = "00000000000";
        this.profesion = "Sin Profesión";
        this.especialidad = "Sin Especialidad";
        this.sexo = "Desconocido"; 
    }
    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNacimiento,
                   String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fechaNacimiento); 
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Datos de Docente ");
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Sexo: " + sexo);
    }
    public String getNit() { return nit; }
    @Override 
    public String getProfesion() { return profesion; }
    public String getEspecialidad() { return especialidad; }
    @Override 
    public String getSexo() { return sexo; }
    public void setNit(String nit) { this.nit = nit; }
    public void setProfesion(String profesion) { this.profesion = profesion; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public void setSexo(String sexo) { this.sexo = sexo; }
}