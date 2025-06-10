/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generisadad_5;

/**
 *
 * @author WINDOWS 11
 */
public class Generisadad_5 {
    
    
  
    public static void main(String[] args) {
        
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.apilar(3);
        pilaEnteros.apilar(4);
        pilaEnteros.apilar(6);
        pilaEnteros.mostrarPila();
        System.out.println("Elemento desapilado: " + pilaEnteros.desapilar());

    
        Pila<String> pilaCadenas = new Pila<>();
        pilaCadenas.apilar("cinco");
        pilaCadenas.apilar("seis");
        pilaCadenas.apilar(" custro");
        pilaCadenas.mostrarPila();
        System.out.println("Elemento desapilado: " + pilaCadenas.desapilar());
    }
}

