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
        System.out.println("Videojuego: " + nombre + ", Plataforma: " + plataforma + ", Jugadores: " + cantidadJugadores);
    }

    public void agregarJugadores() {
        cantidadJugadores += 1;
        System.out.println("Se agregó 1 jugador. Total: " + cantidadJugadores);
    }

    public void agregarJugadores(int cantidad) {
        cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + cantidadJugadores);
    }
}