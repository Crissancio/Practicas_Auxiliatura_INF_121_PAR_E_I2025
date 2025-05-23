package sonido;

public class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    public void moverse() {
        System.out.println("Movimiento genérico de animal");
    }
}
