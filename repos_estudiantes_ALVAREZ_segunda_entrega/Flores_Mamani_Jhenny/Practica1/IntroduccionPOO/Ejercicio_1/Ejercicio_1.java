/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1;

/**
 *
 * @author WINDOWS 11
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Persona persona1=new Persona( " geysa",15," la paz");
        Persona persona2=new Persona( "  pedro ",34," la paz");
        Persona persona3=new Persona( " jazz",45," la paz");
        persona1.mostrarSaludo();
        persona2.mostrarSaludo();
        persona3.mostrarSaludo();

 System.out.println(persona1.nombre + "  la persona 1 es mayor de edad? " + persona1.MayorEdad());
        System.out.println(persona2.nombre + " la persona 2 es mayor de edad? " + persona2.MayorEdad());
        System.out.println(persona3.nombre + "  la persona 3 es mayor de edad? " + persona3.MayorEdad());
        
    }
}
