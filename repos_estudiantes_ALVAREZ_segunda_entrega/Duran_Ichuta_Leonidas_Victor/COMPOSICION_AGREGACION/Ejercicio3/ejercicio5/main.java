
package ejercicio5;

public class main {

    public static void main(String[] args) {
        //b)
        // Crear avión y partes
        Avion boeing653 = new Avion("653", "Un random");

        Parte motor = new Parte("Motor Principal", 1500);
        Parte alaIzquierda = new Parte("Ala Izquierda", 800);
        Parte alaDerecha = new Parte("Ala Derecha", 800);
        Parte trenAterrizaje = new Parte("Tren de Aterrizaje", 600);

        // Agregar partes
        boeing653.agregarParte(motor);
        boeing653.agregarParte(alaIzquierda);
        boeing653.agregarParte(alaDerecha);
        boeing653.agregarParte(trenAterrizaje);
        //c)
        // Mostrar avión
        boeing653.mostrarAvion();

        // Simulación de destrucción (solo mensaje)
        System.out.println("\n¡El avion se destruyo en un accidente! Todas sus partes fueron destruidas que mal :(");
    }
    
}
