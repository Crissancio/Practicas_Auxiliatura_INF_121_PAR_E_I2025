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
public class Gato {
    private String nombre, color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
      // Sobrecarga de hacerSonido
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    public void hacerSonido(String estado) {
        System.out.println(nombre + " está con " + estado + " y dice: ¡Miau miau!");
    }
     //c) Implementar un método moverse()...
    public void moverse() {
        System.out.println(nombre + " salta");
    }
}
