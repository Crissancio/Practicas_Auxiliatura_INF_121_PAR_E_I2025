package Polimorfismo.Ej1;

public class Main {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("FIFA", "PS5", 2);
        Videojuego juego2 = new Videojuego("Zelda", "Nintendo Switch", 1);

        juego1.mostrar();
        juego2.mostrar();

        // Agregamos jugadores usando sobrecarga
        juego1.agregarJugadores(3);
        juego2.agregarJugadores(3);

        System.out.println("\nDespués de agregar jugadores:");
        juego1.mostrar();
        juego2.mostrar();
    }
}
