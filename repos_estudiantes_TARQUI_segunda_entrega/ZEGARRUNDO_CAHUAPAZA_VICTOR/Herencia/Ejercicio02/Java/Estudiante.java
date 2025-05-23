package Herencia2;

public class Estudiante extends Persona {
    private String ru;
    private String fechaIngreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, int celular, int anioNac,
                      String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, anioNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("RU: " + ru + ", Fecha Ingreso: " + fechaIngreso + ", Semestre: " + semestre);
    }
}