/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Fabricio
 */
class Portero extends Jugador {
    String habilidad_especial;

    public Portero(String nombre, int numero, String habilidad) {
        super(nombre, numero, "Portero");
        this.habilidad_especial = habilidad;
    }

    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad: " + habilidad_especial);
    }
}