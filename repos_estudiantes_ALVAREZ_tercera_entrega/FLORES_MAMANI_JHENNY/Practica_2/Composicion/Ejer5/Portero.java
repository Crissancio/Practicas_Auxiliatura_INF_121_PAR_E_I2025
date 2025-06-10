/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac.com5;

/**
 *
 * @author WINDOWS 11
 */
     public class Portero extends Jugador {
    private String habilidadEspecial;

    public Portero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Portero");
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}







