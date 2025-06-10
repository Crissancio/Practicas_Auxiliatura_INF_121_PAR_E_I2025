package ComposicionyAgregacion.Composicion.Ej5;

public class Defensa extends Jugador {
    private String habilidadEspecial;

    public Defensa(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Defensa");
        this.habilidadEspecial = habilidadEspecial;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad Especial: " + habilidadEspecial);
    }
}
