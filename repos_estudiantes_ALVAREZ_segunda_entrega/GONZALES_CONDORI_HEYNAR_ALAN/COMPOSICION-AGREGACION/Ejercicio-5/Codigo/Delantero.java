
package Ejercicio5;

public class Delantero extends Jugador {
    private String habilidadEspecial;

    public Delantero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Delantero");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}
