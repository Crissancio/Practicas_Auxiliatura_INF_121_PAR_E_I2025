public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    //metodo constructor 

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public Videojuego(String nombre, int cantidadJugadores) {
        this.nombre = nombre;
        this.cantidadJugadores = cantidadJugadores;
        this.plataforma="desconocido";
    }

    public Videojuego(String plataforma) {
        this.plataforma = plataforma;
        this.nombre="desconocido";
        this.cantidadJugadores=1; 
    }
    
    public String mostrar(){
        return String.format("Nombre:%s ,Plataforma:%s ,Cantidad de jugadores:%d",this.nombre,this.plataforma,this.cantidadJugadores);
    }
    public int agregarJugadores(){
        return this.cantidadJugadores+=1;
    }
    public int agregarJugadores(int jugadores){
        return this.cantidadJugadores+=jugadores;
    }
}

