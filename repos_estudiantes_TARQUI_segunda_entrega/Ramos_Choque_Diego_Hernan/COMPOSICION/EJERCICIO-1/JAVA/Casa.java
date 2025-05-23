package composicion;
import java.util.ArrayList;
public class Casa {
	private String direccion;
	private ArrayList<Habitacion> habitaciones;
	
	public Casa(String direccion) {
		this.direccion = direccion;
		this.habitaciones = new ArrayList<>();
	}
	public void agregarHabitaciones(String nombre, String tamaño) {
		Habitacion h = new Habitacion(nombre, tamaño);
		this.habitaciones.add(h);		
	}
	
	public void mostrar_info() {
		System.out.println("La casa esta ubicada: " + this.direccion + " y tiene las siguientes habitaciones");
		for(int i = 0; i < this.habitaciones.size(); i++) {
			System.out.print(this.habitaciones.get(i));
		}
		
	}
}
