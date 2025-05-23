package composicion;

public class AppAvion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avion  avion = new Avion("Gulfstream","Boeing");
		avion.agregar_parte(new Parte("Fuselaje", "178,800 kg "));
		avion.agregar_parte(new Parte("Alas","60000 kg"));
		avion.mostrar_avion();
	}

}
