package EJERCICIO9;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Scoot", 3, "Criollo");
        Gato gato = new Gato("michi", "Blanco");
        Pajaro pajaro = new Pajaro("Piolín", "Canario");

        perro.hacerSonido();
        perro.moverse();

        gato.hacerSonido();
        gato.moverse();

        pajaro.hacerSonido();
        pajaro.moverse();
    }
}
