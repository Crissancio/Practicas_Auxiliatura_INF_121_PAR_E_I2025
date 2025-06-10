class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public Videojuego(String nombre, String plataforma) {
        this(nombre, plataforma, 1);
        }

    public Videojuego(String nombre) {
        this(nombre, "Desconocida", 1);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Jugadores: " + cantidadJugadores);
    }

    public void agregarJugadores(int jugadores) {
        cantidadJugadores += jugadores;
        System.out.println("Se agregaron " + jugadores + " jugador(es). Total de jugadores: " + cantidadJugadores);
    }

    public void agregarUnJugador() {
        agregarJugadores(1);
    }

    public static void main(String[] args) {
        Videojuego videojuego1 = new Videojuego("2K24", "PlayStation 3", 4);
        Videojuego videojuego2 = new Videojuego("FNAF", "PC");

        System.out.println("Info del juego 1:");
        videojuego1.mostrar();

        System.out.println("Info del juego 2:");
        videojuego2.mostrar();

        System.out.println("Agregando jugadores al juego 1:");
        videojuego1.agregarJugadores(2);

        System.out.println("Agregando un jugador al juego 2:");
        videojuego2.agregarUnJugador();

        System.out.println("Creando un juego con solo nombre:");
        Videojuego videojuego3 = new Videojuego("Resident Evil");
        videojuego3.mostrar();
    }
}
