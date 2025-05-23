package Polimorfismo.Ej9;

public class BloqueCofre extends Bloque {
    private int capacidad;
    private int resistencia;

    public BloqueCofre(String tipo, int capacidad, int resistencia) {
        super(tipo);
        this.capacidad = capacidad;
        this.resistencia = resistencia;
    }

    @Override
    public void accion() {
        System.out.println("Se abre el cofre y puedes guardar objetos.");
    }

    @Override
    public void romper() {
        System.out.println("El cofre se rompe y todos los objetos caen al suelo.");
    }
}
