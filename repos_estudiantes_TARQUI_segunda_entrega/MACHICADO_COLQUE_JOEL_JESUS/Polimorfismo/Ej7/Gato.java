package Polimorfismo.Ej7;

public class Gato extends Animal {
    private String color;

    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " salta agilmente");
    }
}
