/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac.agre1;

/**
 *
 * @author WINDOWS 11
 */

public class Estdiante {
    private String nombre;
    private String carrera;
    private int semestre;

    public Estdiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre+" "+carrera+" "+semestre);
       
    }
}





