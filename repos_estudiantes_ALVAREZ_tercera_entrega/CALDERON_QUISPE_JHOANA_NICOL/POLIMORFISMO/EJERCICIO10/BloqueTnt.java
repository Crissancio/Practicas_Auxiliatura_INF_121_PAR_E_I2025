package EJERCICIO10;

public class BloqueTnt {
    private String tipo;
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public void accion() {
        System.out.println("Acción en el Bloque TNT. Tipo: " + tipo + " con daño: " + daño);
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando el Bloque TNT en orientación: " + orientacion);
    }

    public void romper() {
        System.out.println("Rompiendo el Bloque TNT. Tipo: " + tipo);
        System.out.println("¡Explosión! Daño causado: " + daño);
    }
}
