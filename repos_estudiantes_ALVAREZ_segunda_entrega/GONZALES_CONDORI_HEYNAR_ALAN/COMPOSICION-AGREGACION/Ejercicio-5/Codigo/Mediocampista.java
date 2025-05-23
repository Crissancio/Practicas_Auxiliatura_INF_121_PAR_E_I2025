
package Ejercicio5;

public class Mediocampista extends Jugador {
    private String habilidadEspecial;

    public Mediocampista(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Mediocampista");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}
