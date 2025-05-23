// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//1. Sea la clase Videojuego:"
//"a) Instanciar al menos 2 videojuegos"
//"b) Sobrecargar el constructor 2 veces"
//"c) Implementar un método mostrar()"
//"d) Sobrecargar el método agregarJugadores() donde en el primero se agregue"
//"solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar."


public class VidioJuego {
    private String nombre;
    private String plataforma;
    private int cantidadDeJugadores;

    public VidioJuego() {
        nombre = "Sin nombre";
        plataforma = "Desconocida";
        cantidadDeJugadores = 0;
    }

    public VidioJuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        cantidadDeJugadores = 0;
    }

    public VidioJuego(String nombre, String plataforma, int cantidadDeJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    public void setCantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadDeJugadores);
    }

    public void actualizarJugadores() {
        cantidadDeJugadores += 1;
        System.out.println("Se agrego 1 jugador, Cantidad total: " + cantidadDeJugadores);
    }

    public void actualizarJugadores(int cantidad) {
        cantidadDeJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Cantidad total: " + cantidadDeJugadores);
    }

    public static void main(String[] args) {
        VidioJuego juego1 = new VidioJuego("God of War", "PlayStation");
        VidioJuego juego2 = new VidioJuego("League of Legends", "PC", 5);

        System.out.println("primer juego:");
        juego1.mostrarInformacion();

        System.out.println("segundo juego:");
        juego2.mostrarInformacion();

        System.out.println("Actualización de jugadores:");
        juego1.actualizarJugadores();
        juego2.actualizarJugadores(3);
    }
}
