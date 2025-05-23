package Ejercicio5;

public class Delantero extends Jugador {
    private String habilidad_especial;

    public Delantero(String n, int num, String habilidad_especial) {
        super(n, num, "Delantero");
        this.habilidad_especial = habilidad_especial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad Especial: " + habilidad_especial);
    }
}
