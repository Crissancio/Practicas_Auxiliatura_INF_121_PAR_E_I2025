/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3.ejer1.gen;

/**
 *
 * @author Adrian
 */ 
/*
1. Ejercicio 1: Generocidad
Crea una clase generica Caja<T> para guardar algun tipo de objeto.
a) Agregar metodos guardar() y obtener().
b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo.
c) Muestra el contenido de las cajas.
*/
public class P3Ejer1Gen {
    
    public static void main(String[] args) {
        // b) creando dos instancias de las cajas con diferentes tipos de datos
        Caja<String> cajaDeMensajes = new Caja<>();
        Caja<Integer> cajaDeNumeros = new Caja<>();

        // b)  almacenamos datos en las cajas
        cajaDeMensajes.guardar("Hola mundo");
        cajaDeNumeros.guardar(11);

        // c ) mostrando el contenido de las dos cajas
        System.out.println("Contenido de la caja de cadenas: " + cajaDeMensajes.obtener());
        System.out.println("Contenido de la caja de números: " + cajaDeNumeros.obtener());
    }
}
