//2. Definir las clases:
//Persona <ci, nombre, apellido, celular, fecha_Nac>;
//Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>;
//Docente (heredado de persona) <nit, profesión, especialidad>;
//b) Implementa las clases con sus constructores, datos por defecto y mostrar.
public class Docente extends Persona {
    private int nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    Docente(int ci, String nombre, String apellido, int celular, int fecha_Nac, int nit, String profesion,
            String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    public int getNit() {
        return this.nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void Mostrar() {
        System.out.println("Docente: " + getNombre() + " " + getApellido() + " ci: " + getCi() + " nit: " + getNit()
                + " celular: " + getCelular() + " profesion: " + getProfesion() + " fecha de nacimiento: "
                + getFecha_Nac() + " especialidad: " + getEspecialidad() + " sexo: " + getSexo());
    }

}
