package Ejercicio5;

public class Defensa extends Jugador {
    private String habilidad_especial;

    public Defensa(String n, int num, String habilidad_especial) {
        super(n, num, "Defensa");
        this.habilidad_especial = habilidad_especial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad Especial: " + habilidad_especial);
    }
}
