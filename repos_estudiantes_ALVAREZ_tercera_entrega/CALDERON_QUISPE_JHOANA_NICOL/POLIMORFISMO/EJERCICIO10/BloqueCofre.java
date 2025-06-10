package EJERCICIO10;

public class BloqueCofre {
    private int capacidad;
    private int resistencia;
    private String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("Acción en el Bloque Cofre de tipo: " + tipo + " con capacidad: " + capacidad
                + " y resistencia: " + resistencia);
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando el Bloque Cofre en orientación: " + orientacion);
    }

    public void romper() {
        System.out.println("Rompiendo el Bloque Cofre de tipo: " + tipo);
        System.out.println("La capacidad del cofre es: " + capacidad + ", resistencia: " + resistencia);
    }
}
