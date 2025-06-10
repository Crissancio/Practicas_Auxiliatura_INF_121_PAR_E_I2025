/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_9;

/**
 *
 * @author WINDOWS 11
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        Computadora miPC = new Computadora("hp", 8, 7, "jhedf");

        miPC.mostrarComponentes();
        miPC.mostrarEstado();

        miPC.encender();
        miPC.mostrarEstado();

        miPC.apagar();
        miPC.mostrarEstado();
    }
}


