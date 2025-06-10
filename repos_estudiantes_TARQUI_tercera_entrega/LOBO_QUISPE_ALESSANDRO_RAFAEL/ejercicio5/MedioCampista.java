
package ejercicio5;

public class MedioCampista extends Jugador {
    private String habilidadEspecial;

    public MedioCampista(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Mediocampista");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}
