/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Fabricio
 */
class Estudiante extends Persona {
     String ru;
     String fechaIngreso;
     int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, int añoNacimiento,
                      String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, añoNacimiento);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru + ", Semestre: " + semestre);
    }
}