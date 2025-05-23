//2. Definir las clases:
//Persona <ci, nombre, apellido, celular, fecha_Nac>;
//Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>;
//Docente (heredado de persona) <nit, profesión, especialidad>;
//b) Implementa las clases con sus constructores, datos por defecto y mostrar.
public class Persona {
    private int ci;
    private String nombre;
    private String apellido;
    private int celular;
    private int fecha_Nac;

    Persona(int ci, String nombre, String apellido, int celular, int fecha_Nac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fecha_Nac = fecha_Nac;
    }

    public int getCi() {
        return this.ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return this.celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getFecha_Nac() {
        return this.fecha_Nac;
    }

    public void setFecha_Nac(int fecha_Nac) {
        this.fecha_Nac = fecha_Nac;
    }

    public void Mostrar() {
    }

}