package Ejercicio3_H;

public class mainEj3 {

	 public static void main(String[] args) {
	        Coche coche1 = new Coche("Toyota", "Corolla", 2023, 22000, 4, "Gasolina");
	        Coche coche2 = new Coche("Hyundai", "Elantra", 2025, 25000, 5, "Híbrido");
	        Moto moto1 = new Moto("Yamaha", "FZ", 2025, 15000, "150cc", "2T");
	        Moto moto2 = new Moto("Honda", "CBR", 2024, 18000, "250cc", "4T");

	        System.out.println("== Información de Vehículos ==");
	        coche1.mostrarInfo();
	        System.out.println();
	        coche2.mostrarInfo();
	        System.out.println();
	        moto1.mostrarInfo();
	        System.out.println();
	        moto2.mostrarInfo();
	        System.out.println();

	        System.out.println("== Coches con más de 4 puertas ==");
	        if (coche1.getNumPuertas() > 4) {
	            coche1.mostrarInfo();
	            System.out.println();
	        }
	        if (coche2.getNumPuertas() > 4) {
	            coche2.mostrarInfo();
	            System.out.println();
	        }

	        System.out.println("== Vehículos de gestión 2025 ==");
	        if (coche1.getAño() == 2025) {
	            coche1.mostrarInfo();
	            System.out.println();
	        }
	        if (coche2.getAño() == 2025) {
	            coche2.mostrarInfo();
	            System.out.println();
	        }
	        if (moto1.getAño() == 2025) {
	            moto1.mostrarInfo();
	            System.out.println();
	        }
	        if (moto2.getAño() == 2025) {
	            moto2.mostrarInfo();
	            System.out.println();
	        }
	    }
	}