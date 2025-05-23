/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pejercicio_9;

/**
 *
 * @author WINDOWS 11
 */
public class PEjercicio_9 {

public static void main(String[] args) {
        Perro perro = new Perro("pou", 3, "chihuaa");
        Gato gato = new Gato("saru", "pollo");
        Pajaro pajaro = new Pajaro("Piolín", " loro");

        perro.hacerSonido();
        perro.hacerSonido("triste");
        perro.moverse();

        System.out.println();

        gato.hacerSonido();
        gato.hacerSonido("jugueton");
        gato.moverse();

        System.out.println();

        pajaro.hacerSonido();
        pajaro.hacerSonido("pio");
        pajaro.moverse();
    }
}



