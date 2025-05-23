package COMPOSICION_AGREGACION.EJER_5;
public class Delantero extends Jugador {
    private String habilidadEspecial;

    public Delantero(String nombre, int numero) {
        super(nombre, numero, "Delantero");
        this.habilidadEspecial = "Goles";
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}