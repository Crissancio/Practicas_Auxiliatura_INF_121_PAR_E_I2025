package Polimorfismo.Ej9;

public class BloqueTnt extends Bloque {
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        super(tipo);
        this.daño = daño;
    }

    @Override
    public void accion() {
        System.out.println("¡La TNT se activa! Corre antes de que explote.");
    }

    @Override
    public void romper() {
        System.out.println("¡La TNT se rompe cuidadosamente... no explota!");
    }
}
