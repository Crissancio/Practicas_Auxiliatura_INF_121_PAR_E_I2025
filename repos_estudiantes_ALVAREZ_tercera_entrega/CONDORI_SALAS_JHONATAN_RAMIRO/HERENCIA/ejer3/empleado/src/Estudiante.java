import java.time.LocalDate;
public class Estudiante extends Persona {
    private String ru;
    private LocalDate fechaIngreso;
    private String semestre;
    public Estudiante() {
        this("0", "Nombre", "Apellido", "0000000", LocalDate.of(2000, 1, 1), 
             "RU000", LocalDate.of(2020, 1, 1), "1");
    }
    public Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                      String ru, LocalDate fechaIngreso, String semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + " | Fecha Ingreso: " + fechaIngreso + " | Semestre: " + semestre + "\n");
    }
}