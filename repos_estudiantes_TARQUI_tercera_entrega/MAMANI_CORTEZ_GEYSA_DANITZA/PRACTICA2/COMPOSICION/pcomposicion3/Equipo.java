/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposicion3;
import java.util.ArrayList;
/**
 *
 * @author Administrador
 */
public class Equipo {
    private String nombre;
    private ArrayList <Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores=new ArrayList<Jugador>();
    }
    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }
    public void mostrarInfo() 
    { 
        System.out.println("Equipo: "+nombre);
        System.out.println("Plantilla:");
       for (Jugador p : jugadores) 
            p.mostrarInfo();
       
    }
    
}
