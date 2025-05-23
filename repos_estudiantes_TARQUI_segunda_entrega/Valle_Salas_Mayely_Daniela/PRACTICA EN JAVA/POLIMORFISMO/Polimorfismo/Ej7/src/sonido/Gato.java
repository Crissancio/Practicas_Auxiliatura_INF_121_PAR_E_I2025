package sonido;

public class Gato extends Animal {
    String color;

    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato " + nombre + " maulla: ¡Miau!");
    }

    @Override
    public void moverse() {
        System.out.println("El gato " + nombre + " salta.");
    }
}