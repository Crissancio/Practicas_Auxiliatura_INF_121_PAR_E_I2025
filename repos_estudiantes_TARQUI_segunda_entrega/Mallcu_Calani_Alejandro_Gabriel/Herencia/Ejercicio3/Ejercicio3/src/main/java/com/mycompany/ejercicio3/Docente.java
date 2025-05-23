/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author USUARIO
 */
public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, String fechaNacStr, String sexo,
                   String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNacStr, sexo);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    // Getters
    public String getNit() { return nit; }
    public String getProfesion() { return profesion; }
    public String getEspecialidad() { return especialidad; }

    // Setters
    public void setNit(String nit) { this.nit = nit; }
    public void setProfesion(String profesion) { this.profesion = profesion; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    @Override
    public String mostrar() {
        return String.format("%s, NIT: %s, Profesión: %s, Especialidad: %s",
                super.mostrar(), nit, profesion, especialidad);
    }
}