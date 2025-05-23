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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a) Instanciar al menos 2 videojuegos
        VideoJuego j1 = new VideoJuego();
        VideoJuego j2 = new VideoJuego("FIFA", "PlayStation", 4);
        VideoJuego j3 = new VideoJuego("app");
        //c) Implementar un método mostrar()
        System.out.println("---Videojuego---");
        j1.mostrar();
        j2.mostrar();
        j3.mostrar();
        //Sobrecargar el método agregarJugadores() donde en el primero se agregue solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
        System.out.println("\n--- Agregar Videojuego---");
        j1.agregarJugadores();
        j1.mostrar();
        //
        j2.agregarJugadores(2);
        j2.mostrar();
    }
    
}
