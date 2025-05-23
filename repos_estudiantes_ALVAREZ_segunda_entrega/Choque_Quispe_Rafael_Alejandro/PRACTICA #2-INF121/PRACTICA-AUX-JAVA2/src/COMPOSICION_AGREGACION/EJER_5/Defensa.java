package COMPOSICION_AGREGACION.EJER_5;
public class Defensa extends Jugador {
    private String habilidadEspecial;

    public Defensa(String nombre, int numero) {
        super(nombre, numero, "Defensa");
        this.habilidadEspecial = "Marcaje";
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}