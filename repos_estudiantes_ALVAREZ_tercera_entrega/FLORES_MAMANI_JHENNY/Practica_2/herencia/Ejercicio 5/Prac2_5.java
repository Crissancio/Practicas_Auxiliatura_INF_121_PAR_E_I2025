/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prac2_5;



/**
 *
 * @author WINDOWS 11
 */
public class Prac2_5 {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("jgawin", "joss", 100, 9, "marketing", 100);
        Gerente g2 = new Gerente("top", "Titr", 800, 4, "cocina", 4000);

        Desarrolador d1 = new Desarrolador("sofia", "lopes", 2500, 2, "Java", 45);
        Desarrolador d2 = new Desarrolador("pedro", "peres", 4500, 3, "Python", 6);
        Desarrolador d3 = new Desarrolador("maria", "gomez", 4200, 5, "C++", 12);
        //a
        System.out.println("== Salarios ==");
        g1.mostrar();
        g2.mostrar();
        d1.mostrar();
        d2.mostrar();
        d3.mostrar();

        // ejercico
        System.out.println("\n== Gerentes con bono > 1000 ==");
        if (g1.getBonoGerencial() > 1000) g1.mostrar();
        if (g2.getBonoGerencial() > 1000) g2.mostrar();

        // ejercicio
        System.out.println("\n== Desarrolladores con más de 10 horas extras ==");
        if (d1.getHorasExtras() > 10) d1.mostrar();
        if (d2.getHorasExtras() > 10) d2.mostrar();
        if (d3.getHorasExtras() > 10) d3.mostrar();
    }
}




