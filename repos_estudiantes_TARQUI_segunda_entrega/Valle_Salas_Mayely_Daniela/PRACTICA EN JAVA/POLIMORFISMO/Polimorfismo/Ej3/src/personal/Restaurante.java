package personal;

public class Restaurante {
	 public static void main(String[] args) {
	     Cocinero cocinero = new Cocinero("Ana", 1200, 10, 15.0f);
	     Mesero mesero1 = new Mesero("Dana", 1000, 5, 10.0f, 50.0f);
	     Mesero mesero2 = new Mesero("Fabiola", 1100, 3, 12.0f, 30.0f);
	     Administrativo admin1 = new Administrativo("Luis", 1500, "Gerente");
	     Administrativo admin2 = new Administrativo("Andres", 1400, "Contadora");

	     System.out.println("Sueldo total Cocinero: " + cocinero.sueldoTotal());
	     System.out.println("Sueldo total Mesero 1: " + mesero1.sueldoTotal());
	     System.out.println("Sueldo total Mesero 2: " + mesero2.sueldoTotal());
	     System.out.println("Sueldo total Administrativo 1: " + admin1.sueldoTotal());
	     System.out.println("Sueldo total Administrativo 2: " + admin2.sueldoTotal());

	     System.out.println("\nEmpleados con SueldoMes igual a 1000:");
	     cocinero.mostrarSueldo(1000);
	     mesero1.mostrarSueldo(1000);
	     mesero2.mostrarSueldo(1000);
	     admin1.mostrarSueldo(1000);
	     admin2.mostrarSueldo(1000);
	 }
	}
