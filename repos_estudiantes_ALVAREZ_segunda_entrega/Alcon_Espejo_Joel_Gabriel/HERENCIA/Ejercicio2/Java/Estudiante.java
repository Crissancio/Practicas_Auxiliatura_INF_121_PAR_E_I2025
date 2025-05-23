import java.time.LocalDate;

class Estudiante extends Persona {
    private String ru;
    private LocalDate fechaIngreso;
    private int semestre;

    // Constructor por defecto
    public Estudiante() {
        super();
        this.ru = "000000";
        this.fechaIngreso = LocalDate.now();
        this.semestre = 1;
    }

    // Constructor completo
    public Estudiante(String ci, String nombre, String apellido, String celular, 
                     LocalDate fechaNac, char sexo, String ru, 
                     LocalDate fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    // Getters y Setters
    public String getRu() { return ru; }
    public void setRu(String ru) { this.ru = ru; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Fecha Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
        System.out.println("----------------------------");
    }
}