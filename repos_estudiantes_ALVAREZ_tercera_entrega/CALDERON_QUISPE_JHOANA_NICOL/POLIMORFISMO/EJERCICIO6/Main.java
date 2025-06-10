public class Main {
    public static void main(String[] args) {

        Videojuego juego1 = new Videojuego("Jhoana", "Xbox", 2);
        Videojuego juego2 = new Videojuego("Vanesa", "PlayStation");

        juego1.mostrar();
        System.out.println();
        juego2.mostrar();

        juego1.agregarJugadores();
        juego2.agregarJugadores(3);
    }
}
