package ComposicionyAgregacion.Composicion.Ej5;

public class Delantero extends Jugador {
    private String habilidadEspecial;

    public Delantero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Delantero");
        this.habilidadEspecial = habilidadEspecial;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad Especial: " + habilidadEspecial);
    }
}
