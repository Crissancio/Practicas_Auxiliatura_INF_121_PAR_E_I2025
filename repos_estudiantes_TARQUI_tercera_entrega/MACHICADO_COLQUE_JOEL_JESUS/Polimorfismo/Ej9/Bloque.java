package Polimorfismo.Ej9;

public class Bloque {
    protected String tipo;

    public Bloque(String tipo) {
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("Acción genérica de bloque.");
    }

    public void colocar() {
        System.out.println("Bloque colocado en posición predeterminada.");
    }

    public void colocar(String orientacion) {
        System.out.println("Bloque colocado en la " + orientacion);
    }

    public void romper() {
        System.out.println("Bloque roto.");
    }
}
