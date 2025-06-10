/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgenericidad3;

/**
 *
 * @author Administrador
 */
public class PGenericidad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // c) Pila de enteros
        Pila<Integer> pilaE = new Pila<>();
        pilaE.apilar(10);
        pilaE.apilar(20);
        pilaE.apilar(30);
        pilaE.mostrar();
        System.out.println("Desapilado: " + pilaE.desapilar());

        System.out.println("-----------------------------");
        // c) Pila de cadenas
        Pila<String> pilaC = new Pila<>();
        pilaC.apilar("Uno");
        pilaC.apilar("Dos");
        pilaC.apilar("Tres");
        pilaC.mostrar();
        System.out.println("Desapilado: " + pilaC.desapilar());
    }
    
}
