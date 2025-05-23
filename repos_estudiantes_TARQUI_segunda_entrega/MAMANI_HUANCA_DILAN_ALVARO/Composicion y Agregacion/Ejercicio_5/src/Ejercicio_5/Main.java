package Ejercicio_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

        // b) Crear equipo
        System.out.print("Nombre del Equipo: ");
        String nombreEquipo = leer.nextLine();

        System.out.print("Cantidad de Jugadores: ");
        int cantidad = leer.nextInt();
        leer.nextLine(); 

        Equipo e1 = new Equipo(nombreEquipo, cantidad);

        // Agregamos jugadores de diferentes tipos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nJugador " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = leer.nextLine();
            System.out.print("Nro.: ");
            int numero = leer.nextInt();
            leer.nextLine();
            System.out.print("Tipo (Portero, Defensa, MedioCampista, Delantero)");
            String posicion = leer.nextLine();

            Jugador jugador = new Jugador(nombre, numero, posicion);
            e1.getJugadores()[i] = jugador;
        }

        // c) Mostrar
        System.out.println("\nINFORMACIÓN DEL EQUIPO:");
        e1.mostrar_equipo();

	}

}
