
package Ejercicio5;

public class Portero extends Jugador {
    private String habilidadEspecial;

    public Portero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Portero");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}
