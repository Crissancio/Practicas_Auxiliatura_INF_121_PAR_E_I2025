package composicion;
import java.util.ArrayList;

public class Casa {
	private String direccion;
	private ArrayList<Habitacion> habitaciones;
	
	public Casa(String direccion) {
	    this.direccion = direccion;
	    this.habitaciones = new ArrayList<>();
	}
	public String getDireccion() {
	    return direccion;
	}
	public ArrayList<Habitacion> getHabitaciones() {
	    return habitaciones;
	}
	public void setDireccion(String direccion) {
	    this.direccion = direccion;
	}
	public void agregarHabitacion(Habitacion habitacion) {
	    habitaciones.add(habitacion);
	}
	public void mostrarCasa() {
	    System.out.println("Dirección de la casa: " + direccion);
	    System.out.println("Habitaciones:");
	    for (Habitacion h : habitaciones) {
	        h.mostrarInfo();
	    }
	}
}
