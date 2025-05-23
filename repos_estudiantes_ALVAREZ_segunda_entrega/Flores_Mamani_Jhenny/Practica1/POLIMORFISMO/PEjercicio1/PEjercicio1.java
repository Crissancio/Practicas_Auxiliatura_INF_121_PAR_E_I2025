/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pejercicio1;

/**
 *
 * @author WINDOWS 11
 */
public class PEjercicio1 {

   
    public static void main(String[] args) {
        
        Videojuego juego1 = new Videojuego("mario broos", " play", 4);
        Videojuego juego2 = new Videojuego("mini", "PC", 5);

     
        juego1.mostrar();
        juego2.mostrar();

       
        juego1.agregarJugadores();        
        juego2.agregarJugadores(3);      

    
        juego1.mostrar();
        juego2.mostrar();
    }
}


