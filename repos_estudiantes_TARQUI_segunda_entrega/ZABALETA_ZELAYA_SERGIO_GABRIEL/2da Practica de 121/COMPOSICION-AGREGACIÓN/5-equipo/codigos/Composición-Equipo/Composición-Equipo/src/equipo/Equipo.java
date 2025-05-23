/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo;
import java.util.*;
/**
 *
 * @author davin
 */
public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    
    public Equipo(String n)
    {
        this.nombre=n;
        this.jugadores=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void agregarJugador(Jugador j)
    {
        jugadores.add(j);
    }
    
    public void mostrarEquipo()
    {
        System.out.println("------------------NOMBRE DEL EQUIPO------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("------------------------------------------------");
        System.out.println("Jugadores: ");
        for(Jugador j: jugadores)
        {
            j.mostrarInfo();
        }
    }
}
