/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Fabricio
 */
class Docente extends Persona {
     String nit, profesion, especialidad;
     char sexo;

    public Docente(String ci, String nombre, String apellido, String celular, int añoNacimiento,
                   String nit, String profesion, String especialidad, char sexo) {
        super(ci, nombre, apellido, celular, añoNacimiento);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Profesión: " + profesion + ", Especialidad: " + especialidad);
    }
}