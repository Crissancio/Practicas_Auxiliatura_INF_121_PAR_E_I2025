
package ejercicio2;

import java.time.LocalDate;

public class Estudiante extends Persona {
    private String ru;
    private LocalDate fechaIngreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNac,
                      String ru, LocalDate fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    public Estudiante() {
        super();
        this.ru = "000";
        this.fechaIngreso = LocalDate.of(2022, 1, 1);
        this.semestre = 1;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Fecha Ingreso: " + fechaIngreso + ", Semestre: " + semestre);
    }
}
