package composicion;

public class Jugador {
	private String nombre;
	private int numero ;
	private String posicion;
	
	public Jugador(String nombre, int numero, String posicion) {
		
		this.nombre = nombre;
		this.numero = numero;
		this.posicion = posicion;
	}

	public String mostrar_info(){
		return String.format("nombre,numero,posicion [%s , %d , %s]", this.nombre,this.numero,this.posicion);
	}

}
