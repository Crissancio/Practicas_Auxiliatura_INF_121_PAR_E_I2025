package Agregacion;

public class AppFlota {
	public static void main(String[] args) {
		Conductor c1 = new Conductor("Diego", "L2");
		Conductor c2 = new Conductor("Hernan", "D4");
		Conductor c3 = new Conductor("Cris", "R5");
		Conductor c4 = new Conductor("Juan", "M4");
		Vehiculo v1 = new Vehiculo("CHEVROLET", "Cruze", 1998);
		Vehiculo v2 = new Vehiculo("BMW", "Serie 3", 1999);
		Vehiculo v3 = new Vehiculo("AUDI", "A4", 2000);
		Vehiculo v4 = new Vehiculo("BENTLEY", "Continental GT", 2014);
		
		Flota f1 = new Flota();
		f1.agregaronductores(c1);
		f1.agregaronductores(c2);
		f1.agregaronductores(c3);
		f1.agregaronductores(c4);
		f1.agregarVehiculo(v1);
		f1.agregarVehiculo(v2);
		f1.agregarVehiculo(v3);
		f1.agregarVehiculo(v4);
		
		f1.mostrar_info();
	}
}
