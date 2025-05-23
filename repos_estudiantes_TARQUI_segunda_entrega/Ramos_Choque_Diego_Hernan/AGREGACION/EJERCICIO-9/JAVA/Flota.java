package Agregacion;
import java.util.ArrayList;

public class Flota {
	private  ArrayList<Vehiculo> vehiculos;
	private ArrayList<Conductor> conductores;
	
	public Flota() {
		super();
		this.vehiculos = new ArrayList<>();
		this.conductores = new ArrayList<>();
	}
	
	public  void agregarVehiculo( Vehiculo vehiculo){
		this.vehiculos.add(vehiculo);
		
	}
	public void agregaronductores(Conductor conductor) {
		this.conductores.add(conductor);
	}
	public void mostrar_info() {
		for(int i = 0 ; i < this.vehiculos.size(); i++) {
			System.out.println("---------VEHICULO------");
			System.out.println(this.vehiculos.get(i));
			System.out.println("-------CONDUCTOR-------");
			System.out.println(this.conductores.get(i));
		}
		
		
	}
	

}
