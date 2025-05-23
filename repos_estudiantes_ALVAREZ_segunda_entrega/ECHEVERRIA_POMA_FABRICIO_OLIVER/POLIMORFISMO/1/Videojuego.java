public class Videojuego{
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    //B
    public Videojuego(String nombre, String plataforma, int cantidadJugadores){
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    //B
    public Videojuego(String nombre, String plataforma){
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0; 
    }
    //C
    public void mostrar(){
        System.out.println("Detalle");
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Jugadores: " + cantidadJugadores);
    }
    //D
    public void agregarJugadores(){
        this.cantidadJugadores +=1;
        System.out.println("Se agrego 1 jugador. Jugadores totales: " + cantidadJugadores);
    }
    //D
    public void agregarJugadores(int cantidad){
        this.cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Jugadores totales: " + this.cantidadJugadores);
    }
}