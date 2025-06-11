public class Estudiante extends Persona {
    private String ru;
    private String fechaIngreso;
    private int semestre;

    public Estudiante() {
        super();
        this.ru = "0";
        this.fechaIngreso = "01/01/2020";
        this.semestre = 1;
    }
    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac, String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    //A
    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Fecha Ingreso: " + fechaIngreso + ", Semestre: " + semestre);
    }
}