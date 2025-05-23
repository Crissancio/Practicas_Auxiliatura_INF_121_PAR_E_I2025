package Ejercicio_5;

public class Jugador {
	private String nombre;
	private int numero;
	private String posicion;
	
	public Jugador(String nombrex, int numerox, String posicionx) {
		this.nombre=nombrex;
		this.numero=numerox;
		this.posicion=posicionx;
	}
	
	public void mostrar_info() {
		System.out.println("<JUGADOR>");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Nro.: "+this.numero);
		System.out.println("Posicion: "+this.posicion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
}
