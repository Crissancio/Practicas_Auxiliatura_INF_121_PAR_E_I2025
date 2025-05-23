package COMPOSICION_AGREGACION.EJER_5;
public class Portero extends Jugador {
    private String habilidadEspecial;

    public Portero(String nombre, int numero) {
        super(nombre, numero, "Portero");
        this.habilidadEspecial = "Atajadas";
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad especial: " + habilidadEspecial);
    }
}