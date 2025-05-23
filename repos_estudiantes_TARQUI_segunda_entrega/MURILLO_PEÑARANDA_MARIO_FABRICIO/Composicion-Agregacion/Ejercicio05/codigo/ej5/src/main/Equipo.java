/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Fabricio
 */
class Equipo {
    String nombre;
    ArrayList<Jugador> jugadores = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregar_jugador(Jugador j) {
        jugadores.add(j);
    }

    public void mostrar_equipo() {
        System.out.println("Equipo: " + nombre);
        for (Jugador j : jugadores) {
            j.mostrar_info();
        }
    }
}
