// a)
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;
        
    public Equipo(String n) {
        this.nombre = n;
        this.jugadores = new ArrayList<>();
    }
    public String getNombre() { 
        return nombre;
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    public void agregar_jugador(Jugador a) {
        jugadores.add(a);
    }
    public void mostrar_equipo() {
        System.out.println("equipo: " + nombre+": ");
        System.out.println("\n jugadores del equipo:");
        if (jugadores.isEmpty()) {
            System.out.println("no existen judadores");
        } else {
            for (Jugador a : jugadores) {
                a.mostrar_info();
            }
        }
    }
}