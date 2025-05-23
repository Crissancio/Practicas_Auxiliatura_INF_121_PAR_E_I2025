//2. Definir las clases:
//Persona <ci, nombre, apellido, celular, fecha_Nac>;
//Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>;
//Docente (heredado de persona) <nit, profesión, especialidad>;
//b) Implementa las clases con sus constructores, datos por defecto y mostrar.
public class Estudiante extends Persona {
    private int ru;
    private String fecha_ingreso;
    private int semestre;

    public Estudiante(int ci, String nombre, String apellido, int celular, int fecha_Nac, int ru,
            String fecha_ingreso, int semestre) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.ru = ru;
        this.fecha_ingreso = fecha_ingreso;
        this.semestre = semestre;
    }

    public int getRu() {
        return this.ru;
    }

    public void setRu(int ru) {
        this.ru = ru;
    }

    public String getFecha_ingreso() {
        return this.fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void Mostrar() {
        System.out.println("Estudiante: " + getNombre() + " " + getApellido() + " ci: " + getCi() + " ru: " + getRu()
                + " celular: " + getCelular() + " semestre: " + getSemestre() + " fecha de nacimiento: "
                + getFecha_Nac() + " fecha de ingreso: " + getFecha_ingreso());
    }

    //c) Mostrar los estudiantes mayores de 25 años.
    public void EstudiantesMayores() {
        if (2025 - getFecha_Nac() >= 25) {
            System.out
                    .println("Estudiante: " + getNombre() + " " + getApellido() + " ci: " + getCi() + " ru: " + getRu()
                            + " celular: " + getCelular() + " semestre: " + getSemestre() + " fecha de nacimiento: "
                            + getFecha_Nac() + " fecha de ingreso: " + getFecha_ingreso());
        }
    }

}
