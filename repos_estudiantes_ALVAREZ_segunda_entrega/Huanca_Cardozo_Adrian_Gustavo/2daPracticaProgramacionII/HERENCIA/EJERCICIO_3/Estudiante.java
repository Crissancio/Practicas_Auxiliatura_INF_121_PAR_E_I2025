package HERENCIA.EJERCICIO_3;

import java.time.LocalDate;

public class Estudiante extends Persona {
    private String ru;
    private LocalDate fechaIngreso;
    private int semestre;

    public Estudiante() {
        super();
        this.ru = "RU000";
        this.fechaIngreso = LocalDate.of(2020, 2, 1);
        this.semestre = 1;
    }

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
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
    }
}
