/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pejercicio5;

/**
 *
 * @author WINDOWS 11
 */
public class PEjercicio5 {

   
    public static void main(String[] args) {
       
        Oficina oficina1 = new Oficina(4, 3, 2);
        Oficina oficina2 = new Oficina(6, 4, 3);

      
        Aula aula1 = new Aula("Aula 101", 30, 30);
        Aula aula2 = new Aula("Aula 102", 25, 25);

       
        Laboratorio lab1 = new Laboratorio("Lab Física", 20, 10, 20);

        
        oficina1.mostrar();
        System.out.println("Total muebles: " + oficina1.cantidadMuebles() + "\n");

        oficina2.mostrar();
        System.out.println("Total muebles: " + oficina2.cantidadMuebles() + "\n");

        aula1.mostrar();
        System.out.println("Total muebles: " + aula1.cantidadMuebles() + "\n");

        aula2.mostrar();
        System.out.println("Total muebles: " + aula2.cantidadMuebles() + "\n");

        lab1.mostrar();
        System.out.println("Total muebles: " + lab1.cantidadMuebles() + "\n");
    }
}


