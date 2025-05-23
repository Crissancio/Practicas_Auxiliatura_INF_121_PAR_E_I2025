public class Estudiante extends Persona {
    public String ru;
    public String fechaIngreso;
    public String semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac,
                      String ru, String fechaIngreso, String semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + ", RU: " + ru + ", Fecha Ingreso: " + fechaIngreso + ", Semestre: " + semestre;
    }

    public String getApellido() {
        return this.apellido;
    }
}
