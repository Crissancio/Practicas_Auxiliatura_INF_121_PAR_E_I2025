package futbol_composicion;

public class Jugador {
	private String nombre;
	private int numero;
	private String posicion;
	
	
	public Jugador(String nombre, int numero,String posicion) {
		this.nombre=nombre;
		this.numero=numero;
		this.posicion=posicion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setposicion(String posicion) {
		this.posicion=posicion;
	}
	
	public void mostrarinf() {
		System.out.println("el nombre del jugador es "+nombre+" con el numero "+numero+" y la posicion del jugador "+posicion);
	}
}
