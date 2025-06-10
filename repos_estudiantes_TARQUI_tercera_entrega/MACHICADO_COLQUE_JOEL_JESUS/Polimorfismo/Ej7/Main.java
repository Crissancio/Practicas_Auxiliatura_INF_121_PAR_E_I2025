package Polimorfismo.Ej7;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais", 5, "Labrador");
        Gato gato = new Gato("Michi", "Blanco");
        Pajaro pajaro = new Pajaro("Piolín", "Canario");

        perro.hacerSonido();
        perro.moverse();

        gato.hacerSonido();
        gato.moverse();

        pajaro.hacerSonido();
        pajaro.moverse();
    }
}
