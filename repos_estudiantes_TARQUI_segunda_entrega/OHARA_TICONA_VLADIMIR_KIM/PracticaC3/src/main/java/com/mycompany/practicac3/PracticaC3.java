/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicac3;

/**
 *
 * @author Usuario
 */
public class PracticaC3 {

    public static void main(String[] args) {
        Equipo equipo = new Equipo("The Stronguest");
        equipo.agregarJugador(new Portero("Carlos", 1, "Atajadas espectaculares"));
        equipo.agregarJugador(new Defensa("Luis", 4, "Marcaje fuerte"));
        equipo.agregarJugador(new Mediocampista("Marco", 8, "Pases precisos"));
        equipo.agregarJugador(new Delantero("Juan", 10, "Goles de larga distancia"));

        equipo.mostrarEquipo();
    }
}
