package futbol_composicion;

public class Delantero extends Jugador {
	private int goles;
	
	public Delantero(int goles,String nombre, int numero,String posicion) {
		super(nombre,numero,posicion);
		this.goles=goles;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles=goles;
	}
	@Override
	public void mostrarinf() {
		super.mostrarinf();
		System.out.println("la cantidad de goles que hiso fue "+goles);
	}
}
