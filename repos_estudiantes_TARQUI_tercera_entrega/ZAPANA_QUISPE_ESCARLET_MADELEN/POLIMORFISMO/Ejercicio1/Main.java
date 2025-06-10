public class App {

    public static void main(String[] args) {
        Videojuego v1=new Videojuego("marioKarts","Nintendo",4);
        Videojuego v2=new Videojuego("Call of dutty","PC",2);
        System.out.println(v1.mostrar());
        System.out.println(v2.mostrar());
        System.out.println(v1.agregarJugadores());
        System.out.println(v1.mostrar());
        System.out.println(v2.agregarJugadores(20));
        System.out.println(v2.mostrar());
    }
    
}
