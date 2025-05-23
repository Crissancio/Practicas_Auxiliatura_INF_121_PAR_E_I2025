/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pejercicio1;

/**
 *
 * @author WINDOWS 11
 */
    public class Videojuego {

   
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

 
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre+" plataforma:  "+plataforma +" cantidad de jugadores;  "+cantidadJugadores);
     
    }

  
    public void agregarJugadores() {
        cantidadJugadores += 1;
        System.out.println("Se agregó 1 jugador.");
    }

    
    public void agregarJugadores(int cantidad) {
        cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores.");
    }

    
}
