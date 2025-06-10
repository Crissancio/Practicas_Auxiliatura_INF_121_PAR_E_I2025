/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio_9;

/**
 *
 * @author WINDOWS 11
 */
public class Gato {
    private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    public void hacerSonido(String emocion) {
        System.out.println(nombre + " está " + emocion + " dice: ¡Miauuu~!");
    }

    public void moverse() {
        System.out.println(nombre + "  duerme :  ");
    }
}

