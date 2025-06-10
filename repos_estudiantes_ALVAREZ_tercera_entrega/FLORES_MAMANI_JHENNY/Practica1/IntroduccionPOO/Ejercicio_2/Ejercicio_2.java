/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2;

/**
 *
 * @author WINDOWS 11
 */
public class Ejercicio_2{

    public static void main(String[] args) {
      
         Coche coche1 = new Coche("Toyota", "lolf",70);
         Coche coche2 = new Coche("Ford", "fentus",30);

        coche1.acelerar();
        coche1.frenar();
        coche2.acelerar();
        coche2.frenar();
        coche1.mostrarVelocidad();
    }
}
    

