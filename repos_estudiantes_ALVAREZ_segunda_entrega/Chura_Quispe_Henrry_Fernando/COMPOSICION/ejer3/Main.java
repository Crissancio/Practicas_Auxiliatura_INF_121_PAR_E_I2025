package avion_composicion;

public class Main {

	public static void main(String[] args) {
		
		Avion av = new Avion("Avon X200", "Elon Musk Aerospace");
		
		Parte part1 = new Parte("Ala","50kg");
		Parte part2 = new Parte("Rueda","90kg");
		Parte part3 = new Parte("Motor","250kg");
		Parte part4 = new Parte("Tren de Aterrizaje","70kg");
		

		
		av.agregarPartes(part1);
		av.agregarPartes(part2);
		av.agregarPartes(part3);
		av.agregarPartes(part4);
		
		av.MostrarinfAvion();
		
		av=null;
	}

}
