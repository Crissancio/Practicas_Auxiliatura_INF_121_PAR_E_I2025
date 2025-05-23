package Ejercicio1_H;

public class Estudiante extends Persona {
    String ru, fechaIngreso;
    int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac,
                      String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("RU: " + ru + ", Ingreso: " + fechaIngreso + ", Semestre: " + semestre);
    }
}
