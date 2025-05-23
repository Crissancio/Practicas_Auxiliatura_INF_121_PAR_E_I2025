package habitaciones;

public class Main {

	public static void main(String[] arg) {
		
		
		
		Casa casa = new Casa(" av siempre viva ");
		
		Habitacion habit = new Habitacion(" A34","23mt2");
		Habitacion habit2 = new Habitacion(" A434","2565mt2");
		Habitacion habit3 = new Habitacion(" B34","56mt2");
		Habitacion habit4 = new Habitacion(" C434","345mt2");

		casa.agregarHabi(habit);
		casa.agregarHabi(habit2);
		casa.agregarHabi(habit3);
		casa.agregarHabi(habit4);
		
		casa.mostrarCasa();
		
	}
}
