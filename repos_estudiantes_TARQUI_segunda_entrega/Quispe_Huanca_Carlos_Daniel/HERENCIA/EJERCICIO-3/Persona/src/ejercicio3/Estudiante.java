package ejercicio3;

public class Estudiante extends Persona {
    private String ru;
    private String fechaIngreso;
    private int semestre;
    
    public Estudiante() {
        this("", "", "", "", "2000-01-01", "", "", "2020-01-01", 1);
    }
    
    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac, String sexo,
                     String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Fecha Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
    }
    
    public String getRu() { return ru; }
    public String getFechaIngreso() { return fechaIngreso; }
    public int getSemestre() { return semestre; }
    
    public void setRu(String ru) { this.ru = ru; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
}