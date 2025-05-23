package sonido;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Falcon", 16, "Chapi");
        Gato gato = new Gato("Manolo", "Negro Atigrado");
        Pajaro pajaro = new Pajaro("Julio", "Loro");

        perro.hacerSonido();
        perro.moverse();

        gato.hacerSonido();
        gato.moverse();

        pajaro.hacerSonido();
        pajaro.moverse();
    }
}