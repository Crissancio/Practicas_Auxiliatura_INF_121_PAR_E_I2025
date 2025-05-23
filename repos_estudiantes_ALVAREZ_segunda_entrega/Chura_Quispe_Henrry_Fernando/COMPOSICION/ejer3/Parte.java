package avion_composicion;

public class Parte {
	private String nombre;
	private String peso;
	
	public Parte(String nombre, String peso) {
		this.nombre=nombre;
		this.peso=peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso=peso;
	}
	
	public void mostrarInf() {
		System.out.println("la pieza "+nombre+" tiene un peso "+peso);
	}
}
