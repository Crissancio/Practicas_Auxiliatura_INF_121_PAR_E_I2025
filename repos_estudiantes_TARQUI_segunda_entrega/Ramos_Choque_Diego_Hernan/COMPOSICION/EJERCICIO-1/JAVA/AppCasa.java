package composicion;

public class AppCasa {
	public  static void  main(String[] args) {
		Casa hogar = new Casa( "Bajo LLojeta calle:5-Las Retamas");
		hogar.agregarHabitaciones("Salon", "3m2");
		hogar.agregarHabitaciones("Estuduio", "1m2");
		hogar.agregarHabitaciones("Cocina", "3m2");
		hogar.agregarHabitaciones("Lavavo", "1m2");
		hogar.mostrar_info();
	}
}
