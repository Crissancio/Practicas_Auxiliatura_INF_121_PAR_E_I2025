import java.time.LocalDate;

class Estudiante extends Persona {
    private String ru;
    private LocalDate fechaIngreso;
    private int semestre;

    public Estudiante() {
        super(); 
        this.ru = "000000000";
        this.fechaIngreso = LocalDate.of(2020, 1, 1); 
        this.semestre = 1;
    }
    public Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNacimiento,
                      String ru, LocalDate fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNacimiento); 
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }
    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println(" Datos de Estudiante ");
        System.out.println("RU: " + ru);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
    }
    public String getRu() { return ru; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public int getSemestre() { return semestre; }

    public void setRu(String ru) { this.ru = ru; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
}
