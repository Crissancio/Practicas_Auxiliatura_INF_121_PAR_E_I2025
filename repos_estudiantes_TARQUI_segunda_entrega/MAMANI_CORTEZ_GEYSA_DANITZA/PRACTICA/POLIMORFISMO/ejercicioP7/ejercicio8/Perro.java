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
public class Perro {
    private String nombre,raza;
    private int edad;

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    //b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    public void hacerSonido(String estado) {
        System.out.println(nombre + " está " + estado + " y dice: Guau guau!!!!!");
    }
     //c) Implementar un método moverse()...
    public void moverse() {
        System.out.println(nombre + " corre");
    }
}
