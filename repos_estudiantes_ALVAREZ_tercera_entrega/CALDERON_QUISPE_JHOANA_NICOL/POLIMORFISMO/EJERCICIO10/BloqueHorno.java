package EJERCICIO10;

public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out
                .println("Acción en el Bloque Horno. Color: " + color + " con capacidad de comida: " + capacidadComida);
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando el Bloque Horno en orientación: " + orientacion);
    }

    public void romper() {
        System.out.println("Rompiendo el Bloque Horno. Color: " + color);
        System.out.println("Este horno tiene una capacidad de comida de: " + capacidadComida);
    }
}
