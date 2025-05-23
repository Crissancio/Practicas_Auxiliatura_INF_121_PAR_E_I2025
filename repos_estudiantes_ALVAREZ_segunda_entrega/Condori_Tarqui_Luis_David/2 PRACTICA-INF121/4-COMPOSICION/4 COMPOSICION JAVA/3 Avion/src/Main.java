public class Main {
    public static void main(String[] args) {
        // Crear avión y agregar partes
        Parte motor = new Parte("Motor", 1500);
        Parte ala = new Parte("Ala", 3000);
        Parte tren = new Parte("Tren de aterrizaje", 500);

        Avion avion = new Avion("Airbus A380", "Airbus");
        avion.agregarParte(motor);
        avion.agregarParte(ala);
        avion.agregarParte(tren);

        avion.mostrarAvion();
    }
}