/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author Administrador
 */
public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }
    // b) Sobrescribe accion()
    public void accion() {
        System.out.println("Encendiste un horno " + color + ". Puede cocinar " + capacidadComida + " alimentos.");
    }
     //Sobrescribe romper()
    public void romper() {
        System.out.println("Rompiste el horno. se perdieron los alimentos");
    }
    //c) Sobrecarga colocar()
     public void colocar() {
        System.out.println("Horno colocado en posición normal.");
    }

    public void colocar(String orientacion) {
        System.out.println("Horno colocado en la " + orientacion );
    }
}
