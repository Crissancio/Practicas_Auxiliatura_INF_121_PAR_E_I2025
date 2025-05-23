package Ejercicio_1;

public class Main {

	public static void main(String[] args) {
		Coche c1 = new Coche("Toyota", "Vagoneta", 2025, 70000, 5, "Gasolina");
		Coche c2 = new Coche("Ford", "Camioneta", 2024, 90000, 4, "Diesel");
		Coche c3 = new Coche("Nissan", "Minibus", 2023, 50000, 4, "G.N.V.");
		Moto m1 = new Moto("Honda", "RXT", 2025 , 30000, 500, "Monocilindrico");
		Moto m2 = new Moto("Yamaha", "Boxer", 2024 , 21000, 250, "Bicilindrico");
		Moto m3 = new Moto("Suzuki", "Bross", 2023 , 25000, 200, "Bicilindrico");
		
		c1.mostrar_info();
		c2.mostrar_info();
		c3.mostrar_info();
		
		m1.mostrar_info();
		m2.mostrar_info();
		m3.mostrar_info();
		//Coches que tienen más de 4 puertas.
		System.out.println("<COCHE CON MAS DE 4 PUERTAS>");
		mostrar_cochesMas4puertas(c1);
		mostrar_cochesMas4puertas(c2);
		mostrar_cochesMas4puertas(c3);
		//Coches y Motos gestión 2025
		System.out.println("COCHES - 2025");
		mostrar_Coches2025(c1);
		mostrar_Coches2025(c2);
		mostrar_Coches2025(c3);
		System.out.println("MOTOS - 2025");
		mostrar_Motos2025(m1);
		mostrar_Motos2025(m2);
		mostrar_Motos2025(m3);
		
	}

	private static void mostrar_Coches2025(Coche coche) {
		if (coche.getAño()==2025) {
			coche.mostrar_info();
		}
		
	}
	private static void mostrar_Motos2025(Moto moto) {
		if (moto.getAño()==2025) {
			moto.mostrar_info();
		}
		
	}

	private static void mostrar_cochesMas4puertas(Coche coche) {
		if(coche.getNum_puertas()>4) {
			coche.mostrar_info();
		}
	}

}
