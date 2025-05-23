package Herencia.ejercicio3.java;

import java.time.LocalDate;

class Estudiante extends Persona {
    String ru;
    LocalDate fechaIngreso;
    int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String ru, LocalDate fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Semestre: " + semestre);
    }
}
