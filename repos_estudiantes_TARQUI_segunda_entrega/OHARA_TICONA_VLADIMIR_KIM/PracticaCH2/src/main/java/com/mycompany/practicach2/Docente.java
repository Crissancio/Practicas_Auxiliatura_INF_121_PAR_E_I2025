package com.mycompany.practicach2;
import java.util.*;
import java.time.*;
public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, LocalDate fechaNac, String sexo,
                   String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    public String getProfesion() {
        return profesion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("NIT: " + nit + " - Profesión: " + profesion + " - Especialidad: " + especialidad);
    }
}

