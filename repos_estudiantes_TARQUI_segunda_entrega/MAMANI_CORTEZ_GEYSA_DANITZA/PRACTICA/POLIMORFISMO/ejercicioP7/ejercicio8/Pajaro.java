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
public class Pajaro {
    private String nombre, tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
     // Sobrecarga de hacerSonido
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío!");
    }

    public void hacerSonido(String estado) {
        System.out.println(nombre + " está " + estado+" y no habla");
    }
     //c) Implementar un método moverse()....
    public void moverse() {
        System.out.println(nombre + " vuela");
    }
}
