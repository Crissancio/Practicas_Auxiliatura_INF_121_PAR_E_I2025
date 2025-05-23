package Composicion2;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 737", "Boeing");

        Parte motor = new Parte("Motor", 2000);
        Parte alas = new Parte("Alas", 3000);
        Parte trenAterrizaje = new Parte("Tren de Aterrizaje", 1500);

        avion.agregarParte(motor);
        avion.agregarParte(alas);
        avion.agregarParte(trenAterrizaje);

        avion.mostrarAvion();
    }
}