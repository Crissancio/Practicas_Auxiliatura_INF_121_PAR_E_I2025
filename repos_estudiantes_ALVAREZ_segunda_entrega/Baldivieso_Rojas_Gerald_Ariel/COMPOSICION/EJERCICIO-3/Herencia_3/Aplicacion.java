package Herencia_3;

public class Aplicacion {
	public static void main(String[] args) {
		 Parte motor = new Parte("Motor", 500);
	     Parte alas = new Parte("Alas", 300);Parte trenAterrizaje = new Parte("Tren de aterrizaje", 200);
	     Avion miAvion = new Avion("Boeing 747", "Boeing");
	     miAvion.agregar_parte(motor);
	     miAvion.agregar_parte(alas);
	     miAvion.agregar_parte(trenAterrizaje);
	     miAvion.mostrar_avion();
	}
}
