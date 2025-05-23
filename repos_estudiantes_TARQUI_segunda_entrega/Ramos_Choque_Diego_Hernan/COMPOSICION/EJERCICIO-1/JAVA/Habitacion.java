package composicion;

public class Habitacion {
	private String nombre;
	private String tamaño;
	public Habitacion(String nombre, String tamaño) {
		this.nombre = nombre;
		this.tamaño = tamaño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
	@Override
	public String toString() {
		return "Habitacion [nombre=" + nombre + ", tamaño=" + tamaño + "]";
	}
	

}
