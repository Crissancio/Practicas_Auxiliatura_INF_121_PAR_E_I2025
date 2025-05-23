package ejercicio3;

public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    
    public Docente() {
        this("", "", "", "", "2000-01-01", "", "", "", "");
    }
    
    public Docente(String ci, String nombre, String apellido, String celular, String fechaNac, String sexo,
                  String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
    }
    
    public String getNit() { return nit; }
    public String getProfesion() { return profesion; }
    public String getEspecialidad() { return especialidad; }
    
    public void setNit(String nit) { this.nit = nit; }
    public void setProfesion(String profesion) { this.profesion = profesion; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}