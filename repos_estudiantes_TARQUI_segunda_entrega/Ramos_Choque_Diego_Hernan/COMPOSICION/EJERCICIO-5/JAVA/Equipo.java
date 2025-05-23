package composicion;
import java.util.ArrayList;
public class Equipo {
	private String nombredelequipo;
	private ArrayList<Jugador> jugadores;
	
	public Equipo( String nombre) {
		this.nombredelequipo = nombre;
		this.jugadores = new ArrayList<>();
	}
	public void agregarJugador( Jugador jugador) {
		this.jugadores.add(jugador);
		
	}
	public void mostrar_equipo() {
		System.out.println("------------" + this.nombredelequipo + "---------------");
		for (int i = 0 ; i < this.jugadores.size(); i++) {
			System.out.println(this.jugadores.get(i).mostrar_info());
		}
	}
	
}
