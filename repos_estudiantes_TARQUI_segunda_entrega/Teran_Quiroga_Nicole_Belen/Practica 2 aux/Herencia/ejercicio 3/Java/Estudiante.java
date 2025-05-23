import java.time.LocalDate;

class Estudiante extends Persona {
    public String ru, fechaIngreso;
    public int semestre;
    public Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo,
                      String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Semestre: " + semestre);
    }
}