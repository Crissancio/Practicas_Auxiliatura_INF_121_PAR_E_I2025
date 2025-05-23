/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Administrador
 */
public class VideoJuego {
    private String nombre,plataforma;
    private int cantidadJugadores;
    public VideoJuego(){
        nombre="Candy";
        plataforma="app";
        cantidadJugadores=2;
    }
    //b) Sobrecargar el constructor 2 veces
     public VideoJuego(String plataforma) {
        this.nombre = "Minecraft";
        this.plataforma = plataforma;
        this.cantidadJugadores =1;
    }
    public VideoJuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    //c) Implementar un método mostrar()
    public void mostrar(){
        System.out.println(nombre+" "+plataforma+" "+cantidadJugadores);
    }
    //Sobrecargar el método agregarJugadores() donde en el primero se agregue solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
    public void agregarJugadores(){
         this.cantidadJugadores += 1;
    }
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }
        
}
