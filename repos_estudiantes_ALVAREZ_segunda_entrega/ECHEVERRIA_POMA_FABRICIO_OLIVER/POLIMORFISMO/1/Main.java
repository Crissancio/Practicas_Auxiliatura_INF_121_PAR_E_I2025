/** 
 * ------------------ENUNCIADO------------------
 * 
 * 1. Sea la clase Videojuego:

a) Instanciar al menos 2 videojuegos
b) Sobrecargar el constructor 2 veces
c) Implementar un método mostrar()
d) Sobrecargar el método agregarJugadores() donde en el primero se agregue
solo 1 jugador y en otro se ingrese una cantidad de jugadores a aumentar.
 * 
 * 
 */
public class Main {
    public static void main(String[] args){
        //A
        Videojuego juego1 = new Videojuego("Minecraft", "PC", 4);
        Videojuego juego2 = new Videojuego("MarioBros", "PS5");

        System.out.println("Iniciamos");
        juego1.mostrar();
        juego2.mostrar();
        System.out.println("-------------------------");

        System.out.println("Agregamos jugador");
        juego1.agregarJugadores();
        juego2.agregarJugadores();
        System.out.println("-------------------------");

        System.out.println("Agregamos mas jugadores");
        juego1.agregarJugadores(6);
        juego2.agregarJugadores(9);
        System.out.println("-------------------------");

        System.out.println("Terminamos");
        juego1.mostrar();
        juego2.mostrar();
    }    
}
