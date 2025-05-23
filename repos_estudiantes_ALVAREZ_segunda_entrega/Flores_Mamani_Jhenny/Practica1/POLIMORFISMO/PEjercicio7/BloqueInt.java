/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio_7;

/**
 *
 * @author WINDOWS 11
 */
public class BloqueInt {
    private String tipo;
    private int daño;

    public BloqueInt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public void accion() {
        System.out.println("       " + tipo);
    }

    public void colocar() {
        System.out.println("Colocando Bloque TNT e   ");
    }

    public void colocar(String lugar) {
        System.out.println("Colocando Bloque " + lugar);
    }

    public void romper() {
        System.out.println("¡caboun! El Bloque TNT explotó  " + daño + "  ");
    }
}
