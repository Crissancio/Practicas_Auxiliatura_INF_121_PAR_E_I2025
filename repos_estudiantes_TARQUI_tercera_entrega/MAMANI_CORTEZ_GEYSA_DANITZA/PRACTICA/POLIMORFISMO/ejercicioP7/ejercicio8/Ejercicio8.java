/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author Administrador
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
        Perro perro = new Perro("Luc", "chiuagua",5);
        Gato gato = new Gato("Mishon", "Negro");
        Pajaro pajaro = new Pajaro("Picote", "loro");
        //b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
        System.out.println("--- Sonidos ---");
        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();

        System.out.println("\n--- Sonidos con estado ---");
        perro.hacerSonido("enojado");
        gato.hacerSonido("hambre");
        pajaro.hacerSonido("asustado");
        //c) Implementar un método moverse() que indique cómo se mueve cada animal(correr, saltar, volar, etc.).
        System.out.println("\n--- Movimiento ---");
        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }
    
    
}
