public class Main {
    public static void main(String[] args) {
        Animal[] animales = {
            new Leon("Simba", 5, "Sabana"),
            new Elefante("Dumbo", 10, 1200),
            new Mono("George", 3, 8)
        };

        System.out.println("== Zoológico ==");
        for (Animal animal : animales) {
            System.out.println(animal.emitirSonido());
        }
    }
}
