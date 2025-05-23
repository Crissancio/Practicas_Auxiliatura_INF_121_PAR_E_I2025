package composicion;

public class Componente {
	private String nombre;
	private String capacidad;
	public Componente(String nombre, String capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}
	
	

	
	

}
