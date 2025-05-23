package Polimorfismo.Ej7;

public class Pajaro extends Animal {
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " vuela por el cielo.");
    }
}
