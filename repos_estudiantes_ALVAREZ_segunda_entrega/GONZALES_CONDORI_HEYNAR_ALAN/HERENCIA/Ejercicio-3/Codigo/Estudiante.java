
package Ejercicio03;

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

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
    }
}
