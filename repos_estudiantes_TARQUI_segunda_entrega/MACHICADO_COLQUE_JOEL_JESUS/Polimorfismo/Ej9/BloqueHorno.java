package Polimorfismo.Ej9;

public class BloqueHorno extends Bloque {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        super("Horno");
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    @Override
    public void accion() {
        System.out.println("El horno comienza a cocinar comida.");
    }

    @Override
    public void romper() {
        System.out.println("Rompes el horno. Se pierde el progreso de cocción.");
    }
}
