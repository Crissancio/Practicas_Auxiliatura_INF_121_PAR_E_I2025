package AgregacionYComposicion;

public class Main {
     public static void main(String[] args) {
        // Crear partes del avión
        Parte motor = new Parte("Motor", 1200);
        Parte alaIzquierda = new Parte("Ala Izquierda", 800);
        Parte alaDerecha = new Parte("Ala Derecha", 800);
        Parte trenAterrizaje = new Parte("Tren de Aterrizaje", 600);

        // Crear avión
        Avion avion = new Avion("Boeing 737", "Boeing");

        // Agregar partes al avión
        avion.agregarParte(motor);
        avion.agregarParte(alaIzquierda);
        avion.agregarParte(alaDerecha);
        avion.agregarParte(trenAterrizaje);

        // Mostrar información del avión
        avion.mostrarAvion();
    }
}
