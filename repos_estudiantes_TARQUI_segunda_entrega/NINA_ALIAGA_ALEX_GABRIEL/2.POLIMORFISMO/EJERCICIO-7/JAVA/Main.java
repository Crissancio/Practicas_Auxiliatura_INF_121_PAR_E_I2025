public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Buddy");
        Gato gato = new Gato("Whiskers");
        Pajaro pajaro = new Pajaro("Tweety");

        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();

        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }
}
