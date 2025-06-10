// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//"9. Para los bloques del juego Minecraft se usará los siguientes objetos:"
//
//"a) Crear e instanciar al menos 2 bloques de cada tipo"
//"b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando"
//"distintos mensajes según el tipo de bloque."
//"c) Sobrecarga colocar() para permitir colocar un bloque en diferentes"
//"orientaciones (por ejemplo, en el suelo o en la pared)."
//"d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando"
//"distintos mensajes según el tipo de bloque y que puede suceder al romperlos."


public class Bloque {
    protected String tipo;

    public Bloque(String tipo) {
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("Acción genérica del bloque.");
    }

    public void colocar(String orientacion) {
        System.out.println("Bloque colocado en orientación: " + orientacion);
    }

    public void colocar(String orientacion, int x, int y, int z) {
        System.out.println("Bloque colocado en orientación " + orientacion + " en coordenadas (" + x + ", " + y + ", " + z + ").");
    }

    public void romper() {
        System.out.println("El bloque se ha roto.");
    }

    public static class BloqueCofre extends Bloque {
        private int capacidad;

        public BloqueCofre(int capacidad, String tipo) {
            super(tipo);
            this.capacidad = capacidad;
        }

        public void accion() {
            System.out.println("El cofre puede almacenar objetos. Capacidad: " + capacidad + ".");
        }

        public void romper() {
            System.out.println("El cofre se ha roto y los objetos se han perdido.");
        }
    }

    public static class BloqueTnt extends Bloque {
        private int daño;

        public BloqueTnt(int daño, String tipo) {
            super(tipo);
            this.daño = daño;
        }

        public void accion() {
            System.out.println("El TNT explota causando un daño de: " + daño + ".");
        }

        public void romper() {
            System.out.println("El TNT se ha roto sin explotar.");
        }
    }

    public static class BloqueHorno extends Bloque {
        private int capacidadComida;

        public BloqueHorno(int capacidadComida, String tipo) {
            super(tipo);
            this.capacidadComida = capacidadComida;
        }

        public void accion() {
            System.out.println("El horno cocina alimentos. Capacidad: " + capacidadComida + ".");
        }

        public void romper() {
            System.out.println("El horno se ha roto y los alimentos se han perdido.");
        }
    }

    public static void main(String[] args) {
        BloqueCofre cofre1 = new BloqueCofre(20, "Cofre de madera");
        BloqueCofre cofre2 = new BloqueCofre(40, "Cofre de hierro");
        BloqueTnt tnt1 = new BloqueTnt(50, "TNT normal");
        BloqueTnt tnt2 = new BloqueTnt(100, "TNT reforzada");
        BloqueHorno horno1 = new BloqueHorno(5, "Horno de piedra");
        BloqueHorno horno2 = new BloqueHorno(10, "Horno industrial");

        System.out.println("Acciones de los bloques:");
        cofre1.accion();
        tnt1.accion();
        horno2.accion();

        System.out.println("Colocar bloques:");
        cofre2.colocar("suelo");
        tnt2.colocar("pared", 12, 15, 20);

        System.out.println("Romper bloques:");
        horno1.romper();
        tnt2.romper();
    }
}
