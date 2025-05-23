// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//7. Se hace referencia a algunos animales mediante las siguientes clases:
//
//a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
//b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
//característico.
//
//c) Implementar un método moverse() que indique cómo se mueve cada animal
//(correr, saltar, volar, etc.).

public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("sonido.");
    }

    public void hacerSonido(String sonido) {
        System.out.println(nombre + " dice: " + sonido);
    }

    public void hacerSonido(String sonido, String accion) {
        System.out.println(nombre + " dice: " + sonido + " mientras está " + accion + ".");
    }

    public static class Perro extends Animal {
        public Perro(String nombre) {
            super(nombre);
        }
    }

    public static class Gato extends Animal {
        public Gato(String nombre) {
            super(nombre);
        }
    }

    public static class Pajaro extends Animal {
        public Pajaro(String nombre) {
            super(nombre);
        }
    }

    public static void main(String[] args) {

        Perro perro = new Perro("toto");
        Gato gato = new Gato("pata fofa");
        Pajaro pajaro = new Pajaro("jak");

        System.out.println("Sonidos de los animales:");
        perro.hacerSonido("AU AU", "corriendo");
        gato.hacerSonido("Miau", "saltando");
        pajaro.hacerSonido("Pío", "volando");
    }
}
