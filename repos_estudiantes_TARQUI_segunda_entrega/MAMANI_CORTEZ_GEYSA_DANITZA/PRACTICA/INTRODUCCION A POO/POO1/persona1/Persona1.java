/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona1;

/**
 *
 * @author Administrador
 */
public class Persona1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  
        //Crea una clase Persona con nombre, edad y ciudad
        //a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
        System.out.println("-------Ejercicio 1");
        Persona p1=new Persona("Maria",12,"Pando");
        p1.mostrar();
       // b) Crea tres personas y muestra su saludo
        System.out.println("--------Ejercicio 2");
        Persona p2=new Persona("Juan",15,"Santa Cruz");
        p2.mostrar();
        Persona p3=new Persona("Ana",16,"Cochabamba");
        p3.mostrar();
        Persona p4=new Persona("Sergio",13,"La Paz");
        p4.mostrar();
        //c) Agrega un método para verificar si es mayor de edad 
        System.out.println("--------Ejercicio 3");
        p1.verifica();
    }
    
}
