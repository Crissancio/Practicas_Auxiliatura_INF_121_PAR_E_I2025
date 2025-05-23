package Herencia.ejercicio3.java;

import java.time.LocalDate;


class Docente extends Persona {
    String nit, profesion, especialidad;
    char sexo;

    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String nit, String profesion, String especialidad, char sexo) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Profesión: " + profesion + ", Especialidad: " + especialidad + ", Sexo: " + sexo);
    }
}
