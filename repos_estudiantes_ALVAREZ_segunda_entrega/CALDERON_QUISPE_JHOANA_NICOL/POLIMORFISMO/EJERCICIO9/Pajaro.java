package EJERCICIO9;

public class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Pío pio");
    }

    public void moverse() {
        System.out.println(nombre + " vuela por los cielos.");
    }
}
