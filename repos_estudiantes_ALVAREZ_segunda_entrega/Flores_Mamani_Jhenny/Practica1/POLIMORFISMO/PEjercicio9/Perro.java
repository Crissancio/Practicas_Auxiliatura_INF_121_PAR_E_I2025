/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio_9;

/**
 *
 * @author WINDOWS 11
 */
public class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println( nombre  + " ¡Guau guau!");
    }

    public void hacerSonido(String estado) {
        System.out.println(nombre + " está " + estado + " dice ¡Grrrr!");
    }

    public void moverse() {
        System.out.println(nombre + " esta corriendo");
    }
}
