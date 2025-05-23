package COMPOSICION_AGREGACION.EJER_5;
public class Mediocampista extends Jugador {
    private String habilidadEspecial;
    public Mediocampista(String nombre, int numero) {
        super(nombre, numero, "Mediocampista");
        this.habilidadEspecial = "Pases";
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}