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
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Persona {
    // Fecha actual para cálculos de edad
    public static final LocalDate FECHA_ACTUAL = LocalDate.of(2025, 5, 22);

    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private LocalDate fechaNac;
    private String sexo;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Persona(String ci, String nombre, String apellido, String celular, String fechaNacStr, String sexo) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        try {
            this.fechaNac = LocalDate.parse(fechaNacStr, DATE_FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha de nacimiento incorrecto. Usar YYYY-MM-DD.", e);
        }
        this.sexo = sexo;
    }

    // Getters
    public String getCi() { return ci; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCelular() { return celular; }
    public LocalDate getFechaNac() { return fechaNac; }
    public String getSexo() { return sexo; }

    // Setters
    public void setCi(String ci) { this.ci = ci; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setCelular(String celular) { this.celular = celular; }
    public void setFechaNac(String fechaNacStr) {
        try {
            this.fechaNac = LocalDate.parse(fechaNacStr, DATE_FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha de nacimiento incorrecto. Usar YYYY-MM-DD.", e);
        }
    }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public int getEdad() {
        if (this.fechaNac == null) {
            return 0;
        }
        return Period.between(this.fechaNac, FECHA_ACTUAL).getYears();
    }

    public String mostrar() {
        return String.format("CI: %s, Nombre: %s %s, Sexo: %s, Celular: %s, Fecha Nac: %s, Edad: %d",
                ci, nombre, apellido, sexo, celular, fechaNac.format(DATE_FORMATTER), getEdad());
    }
}
