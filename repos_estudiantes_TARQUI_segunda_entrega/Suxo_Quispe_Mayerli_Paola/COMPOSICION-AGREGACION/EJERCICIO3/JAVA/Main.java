public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("A320", "Airbus");

        Parte ala = new Parte("Ala Izquierda", 1200.5f);
        Parte motor = new Parte("Motor Derecho", 2200.0f);
        Parte cola = new Parte("Cola", 800.0f);

        avion.agregarParte(ala);
        avion.agregarParte(motor);
        avion.agregarParte(cola);

        System.out.println("\n--- Información del Avión ---");
        avion.mostrarAvion();
    }
}
