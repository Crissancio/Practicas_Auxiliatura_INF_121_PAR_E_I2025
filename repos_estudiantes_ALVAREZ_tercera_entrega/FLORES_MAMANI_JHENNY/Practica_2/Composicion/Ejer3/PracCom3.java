/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac.com3;

/**
 *
 * @author WINDOWS 11
 */
public class PracCom3 {

  
    public static void main(String[] args) {
       
        Avion avion1 = new Avion(" bang", "china");

        avion1.agregarParte(new Parte("Motor", 456));
        avion1.agregarParte(new Parte("parte trasera", 234));
        avion1.agregarParte(new Parte("cavinas", 456));
        avion1.agregarParte(new Parte(" montaje", 654));

 avion1.mostrarAvion();
    }
}
