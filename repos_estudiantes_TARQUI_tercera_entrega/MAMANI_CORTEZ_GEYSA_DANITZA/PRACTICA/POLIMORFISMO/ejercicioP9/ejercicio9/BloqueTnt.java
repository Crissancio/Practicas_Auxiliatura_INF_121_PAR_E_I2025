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
public class BloqueTnt {
    private String tipo;
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }
    // b) Sobrescribe accion()
    public void accion() {
        System.out.println("¡Activaste una TNT tipo " + tipo );
    }
     //Sobrescribe romper()
    public void romper() {
        System.out.println("Rompiste una TNT. ¡BOOM!" + daño);
    }
    //c) Sobrecarga colocar()
    public void colocar() {
        System.out.println("TNT colocada horizontalmente.");
    }

    public void colocar(String orientacion) {
        System.out.println("TNT colocada en la " + orientacion );
    }
}
