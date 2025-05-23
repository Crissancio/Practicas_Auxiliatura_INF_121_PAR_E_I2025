package Ejercicio_1;

import java.util.Scanner;

public class Casa {
	private String direccion;
	private Habitacion[]habitacion;
	
	public Casa(String direccion, int capacidad) {
        this.direccion = direccion;
        this.habitacion = new Habitacion[capacidad];
    }
	public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
	//Agregar Habitacion
    public void agregar_habitacion(Habitacion habitacionx) {
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Habitaciones que desea agregar?");
        int cantidad_hab = leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < habitacion.length && i < cantidad_hab; i++) {
            System.out.println("Habitacion " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = leer.nextLine();
            System.out.print("Tamaño (m2): ");
            double tamano = leer.nextDouble();
            leer.nextLine(); 
            Habitacion nueva = new Habitacion(nombre, tamano);
            this.habitacion[i] = nueva;
        }
    }
    //Mostrar Casa
    public void mostrar_casa() {
        System.out.println("Direccion de la Casa: " + direccion);
        for (int i = 0; i < habitacion.length; i++) {
            if (habitacion[i] != null) {
                habitacion[i].mostrar_info();
            }
        }
	}
}
