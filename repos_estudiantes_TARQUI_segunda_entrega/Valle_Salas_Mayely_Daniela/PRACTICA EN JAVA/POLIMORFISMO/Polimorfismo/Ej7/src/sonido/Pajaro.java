package sonido;

public class Pajaro extends Animal {
    String tipo;

    public Pajaro(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro " + nombre + " canta: ¡Pio!");
    }

    @Override
    public void moverse() {
        System.out.println("El pájaro " + nombre + " vuela.");
    }
}