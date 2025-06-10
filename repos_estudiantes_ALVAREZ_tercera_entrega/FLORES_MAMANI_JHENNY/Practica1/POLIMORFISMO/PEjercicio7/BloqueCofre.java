/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio_7;

/**
 *
 * @author WINDOWS 11
 */
public class BloqueCofre {
    private int capacidad;
    private int resistencia;
    private String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("  " + tipo);
    }

    public void colocar() {
        System.out.println("Colocando Bloque Cofre ");
    }

    public void colocar(String lugar) {
        System.out.println("Colocando Bloque Cofre   " + lugar);
    }

    public void romper() {
        System.out.println("Rompiste el Bloque ");
    }
}
