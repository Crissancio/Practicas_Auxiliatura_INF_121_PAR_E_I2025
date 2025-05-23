/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicac2;

/**
 *
 * @author Usuario
 */
public class PracticaC2 {

    public static void main(String[] args) {
     Avion avion = new Avion("Boeing 747", "Boeing");

        avion.agregar(new Parte("Motor", 5000));
        avion.agregar(new Parte("Ala Izquierda", 3000));
        avion.agregar(new Parte("Ala Derecha", 3000));
        avion.agregar(new Parte("Tren de Aterrizaje", 1500));

        avion.MostrarAv();}
}
