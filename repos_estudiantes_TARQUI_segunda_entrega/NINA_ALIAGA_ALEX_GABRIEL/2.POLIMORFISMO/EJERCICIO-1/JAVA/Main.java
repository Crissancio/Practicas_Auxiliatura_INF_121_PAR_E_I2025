public class Main {
        public static void main(String[] args) {

            Videojuego juego1 = new Videojuego("The Legend of Zelda", "Nintendo Switch", 1);
            Videojuego juego2 = new Videojuego("Minecraft", "PC");
            Videojuego juego3 = new Videojuego("Among Us");
    
    
            juego1.mostrar();
            juego2.mostrar();
            juego3.mostrar();
    
            juego1.agregarJugadores();
            juego2.agregarJugadores(3); 
    
            juego1.mostrar();
            juego2.mostrar();
    }
}