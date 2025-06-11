public class Docente extends Persona {
    private String nit;
    private String profesión;
    private String especialidad;

    public Docente() {
        super();
        this.nit = "0";
        this.profesión = "Sin profesión";
        this.especialidad = "Sin especialidad";
    }

    public Docente(String ci, String nombre, String apellido, String celular, String fechaNac, String nit, String profesión, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesión = profesión;
        this.especialidad = especialidad;
    }

    //A
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + ", Profesión: " + profesión + ", Especialidad: " + especialidad);
    }

    public String getSexo() {
        return getNombre().toLowerCase().startsWith("j") ? "Masculino" : "Femenino";
    }
}