/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio_9;

/**
 *
 * @author WINDOWS 11
 */
public class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }

    public void hacerSonido(String momento) {
        System.out.println(nombre + " canta por la " + momento + ": ¡Chirp chirp!");
    }

    public void moverse() {
        System.out.println(nombre + " vuela por el cielo.");
    }
}

