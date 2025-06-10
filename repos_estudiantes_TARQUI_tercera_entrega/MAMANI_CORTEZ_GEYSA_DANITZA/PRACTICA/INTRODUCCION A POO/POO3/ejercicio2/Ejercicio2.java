/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Administrador
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3. Crea una clase Coche con marca, modelo y velocidad

//c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades
        System.out.println("-------Primer Coche");
        Coche c1=new Coche("Toyota","Hilux",20);
        System.out.println("Aceleracion: ");
        c1.acelerar();
        System.out.println("Frenar: ");
        c1.frenar();
        System.out.println("\n--------Segundo Coche");
        Coche c2=new Coche("Suzuki","Ignis",30);
        System.out.println("Aceleracion: ");
        c2.acelerar();
        System.out.println("Frenar: ");
        c2.frenar();
    }
    
}
