/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac.com5;

/**
 *
 * @author WINDOWS 11
 */
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregar_jugador(Jugador j) {
        jugadores.add(j);
    }

    public void mostrar_equipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Jugadores:");
        for (Jugador j : jugadores) {
            j.mostrarInfo();
            System.out.println();
        }
    }
}

