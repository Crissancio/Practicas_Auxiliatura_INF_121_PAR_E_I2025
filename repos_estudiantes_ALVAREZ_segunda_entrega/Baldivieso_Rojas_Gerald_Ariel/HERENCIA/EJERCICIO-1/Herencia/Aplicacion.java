package Herencia;

public class Aplicacion {
	public static void main(String[] args) {
		Coche coche = new Coche(4,"p","ws","ghf",3,8);
		Moto moto = new Moto(9,"p","ws","ghf",2025,975);
		
		coche.mostrar_info();
		moto.mostrar_info();
		
		coche.vehiculosActuales();
		
		coche.vehiculosActuales();
		moto.vehiculosActuales();
	}
	
	
	
	
}
