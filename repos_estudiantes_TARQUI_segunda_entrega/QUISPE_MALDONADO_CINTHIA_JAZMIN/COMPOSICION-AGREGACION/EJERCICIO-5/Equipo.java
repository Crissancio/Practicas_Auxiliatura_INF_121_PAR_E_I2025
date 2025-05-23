/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5compo;

import java.util.ArrayList;

/**
 *
 * @author CINTHIA
 */
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;
    public Equipo(String nombre){
        this.nombre=nombre;
        this.jugadores=new ArrayList<>();
    }
    public void agregarjugador(Jugador jug){
        jugadores.add(jug);
    }
    public void mostrarE(){
        System.out.println("Equipo: " + nombre);
        for(Jugador jug:jugadores){
            System.out.println("-----------------------");
            jug.mostrar();
        
    }
    }
}
