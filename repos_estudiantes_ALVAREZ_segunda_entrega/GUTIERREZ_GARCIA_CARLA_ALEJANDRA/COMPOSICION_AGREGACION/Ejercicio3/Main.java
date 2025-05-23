package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", "Boeing Company");

        Parte motor = new Parte("Motor", 3000);
        Parte alas = new Parte("Alas", 5000);
        Parte trenAterrizaje = new Parte("Tren de Aterrizaje", 2000);

        avion.agregar_parte(motor);
        avion.agregar_parte(alas);
        avion.agregar_parte(trenAterrizaje);

        avion.mostrar_avion();
    }
}
