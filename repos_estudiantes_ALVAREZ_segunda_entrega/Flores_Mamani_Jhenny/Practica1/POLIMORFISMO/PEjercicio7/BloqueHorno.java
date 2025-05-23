/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio_7;

/**
 *
 * @author WINDOWS 11
 */
public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println(" Color: " + color);
    }

    public void colocar() {
        System.out.println("Colocando Bloque  ");
    }

    public void colocar(String lugar) {
        System.out.println("Colocando Bloque :   " + lugar);
    }

    public void romper() {
        System.out.println("¡Rompiste el Bloque ");
    }
}


