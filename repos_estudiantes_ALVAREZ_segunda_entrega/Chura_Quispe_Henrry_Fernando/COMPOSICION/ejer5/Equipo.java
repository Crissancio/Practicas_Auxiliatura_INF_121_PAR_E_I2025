package futbol_composicion;
import java.util.*;
import java.util.ArrayList;
public class Equipo {
	private String nombre;
	private List<Jugador>jugadores=new ArrayList<>();
	
	
	
	public Equipo(String nombre) {
		this.nombre=nombre;
		
	}
	
	public Equipo(String nombre, List<Jugador>jugadores) {
		this.nombre=nombre;
		this.jugadores=jugadores;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public List<Jugador> getJugadores(){
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores=jugadores;
	}
	public void agregarJugadores(Jugador jugadores) {
		this.jugadores.add(jugadores);
	}
	public void mostrarEquipo() {
		System.out.println("el nombre del quipo es "+nombre+" y sus jugadores son  ");
		System.out.println("---------------------------------");
		for(Jugador jug:jugadores) {
			jug.mostrarinf();
			System.out.println("---------------------------------");
		}
	}
}
