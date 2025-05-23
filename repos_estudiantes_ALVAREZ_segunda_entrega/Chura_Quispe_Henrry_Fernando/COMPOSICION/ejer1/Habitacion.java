package habitaciones;

public class Habitacion {
	private String nombre;
	private String tamanio;
	
	public Habitacion(String nombre , String tamanio) {
		this.nombre=nombre;
		this.tamanio=tamanio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio=tamanio;
	}
	
	public void Mostrarinfo() {
		System.out.println("la habitacion "+nombre+" tiene un tamaño de "+tamanio);
	}
	
	
}
