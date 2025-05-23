package habitaciones;
import java.util.ArrayList;
import java.util.List;


public class Casa {
	private String direccion;
	private List<Habitacion> listhabi = new ArrayList<>();
	
	public Casa(String direccion) {
		this.direccion=direccion;
	}
	
	public Casa( List<Habitacion>listhabi) {
		
		this.listhabi=listhabi;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	public  List<Habitacion> getListhabi(){
		return listhabi;
	}
	public void setListhabi(List<Habitacion> listhabi) {
		this.listhabi=listhabi;
	}
	
	public void  agregarHabi( Habitacion habi) {
		this.listhabi.add(habi);
	}
	
	public void mostrarCasa() {
		System.out.println("la direccion de la casa es "+direccion+" y sus habitaciones son ");
		for (Habitacion hab: listhabi) {
			hab.Mostrarinfo();
		}
	}
	
}
