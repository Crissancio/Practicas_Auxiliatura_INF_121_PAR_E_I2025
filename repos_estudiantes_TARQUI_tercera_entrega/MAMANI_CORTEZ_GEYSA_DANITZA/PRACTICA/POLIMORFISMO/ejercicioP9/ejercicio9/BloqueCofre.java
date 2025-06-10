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
public class BloqueCofre {
    private int capacidad, resistencia;
    private String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }
    // b) Sobrescribe accion()
    public void accion(){
       System.out.println("Abriste un cofre tipo " + tipo + ". Tiene capacidad de " + capacidad + " ítems."); 
    }
     //Sobrescribe romper()
    public void romper(){
       System.out.println("Rompiste un cofre y se cayó todo al piso."); 
    }
    //c) Sobrecarga colocar()
    public void colocar() {
        System.out.println("Cofre colocado en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Cofre colocado en la " + orientacion );
    }
}
