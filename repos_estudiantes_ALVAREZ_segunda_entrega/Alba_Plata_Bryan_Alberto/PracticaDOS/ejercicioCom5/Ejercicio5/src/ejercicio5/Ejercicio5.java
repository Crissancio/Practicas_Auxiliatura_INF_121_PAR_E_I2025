/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Usuario
 */
import java.util.*;

abstract class Jugador {
    protected String nombre;
    protected int numero;
    protected String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + nombre + ", Nº: " + numero + ", Posición: " + posicion);
    }
}

class Portero extends Jugador {
    private String habilidadEspecial;

    public Portero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Portero");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad: " + habilidadEspecial);
    }
}

class Defensa extends Jugador {
    private String habilidadEspecial;

    public Defensa(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Defensa");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad: " + habilidadEspecial);
    }
}

class Mediocampista extends Jugador {
    private String habilidadEspecial;

    public Mediocampista(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Mediocampista");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad: " + habilidadEspecial);
    }
}

class Delantero extends Jugador {
    private String habilidadEspecial;

    public Delantero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Delantero");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad: " + habilidadEspecial);
    }
}

class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Los Tigres");
        equipo.agregar_jugador(new Portero("Juan", 1, "Atajadas"));
        equipo.agregar_jugador(new Defensa("Luis", 2, "Marcaje"));
        equipo.agregar_jugador(new Mediocampista("Carlos", 8, "Pases"));
        equipo.agregar_jugador(new Delantero("Pedro", 9, "Goles"));
        equipo.mostrar_equipo();
    }
    
}
