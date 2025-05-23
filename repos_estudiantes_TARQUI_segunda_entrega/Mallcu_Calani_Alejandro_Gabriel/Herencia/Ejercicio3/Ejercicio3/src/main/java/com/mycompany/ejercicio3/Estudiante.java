/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author USUARIO
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Estudiante extends Persona {
    private String ru;
    private LocalDate fechaIngreso;
    private String semestre;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNacStr, String sexo,
                      String ru, String fechaIngresoStr, String semestre) {
        super(ci, nombre, apellido, celular, fechaNacStr, sexo);
        this.ru = ru;
        try {
            this.fechaIngreso = LocalDate.parse(fechaIngresoStr, DATE_FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha de ingreso incorrecto. Usar YYYY-MM-DD.", e);
        }
        this.semestre = semestre;
    }

    // Getters
    public String getRu() { return ru; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public String getSemestre() { return semestre; }

    // Setters
    public void setRu(String ru) { this.ru = ru; }
    public void setFechaIngreso(String fechaIngresoStr) {
         try {
            this.fechaIngreso = LocalDate.parse(fechaIngresoStr, DATE_FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha de ingreso incorrecto. Usar YYYY-MM-DD.", e);
        }
    }
    public void setSemestre(String semestre) { this.semestre = semestre; }

    @Override
    public String mostrar() {
        return String.format("%s, RU: %s, Fecha Ingreso: %s, Semestre: %s",
                super.mostrar(), ru, fechaIngreso.format(DATE_FORMATTER), semestre);
    }
}