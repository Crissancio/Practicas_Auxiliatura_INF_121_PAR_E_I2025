package ComposicionAgregacion.Ejer5.codigo;

public class Delantero extends Jugador {
    private String habilidadEspecial;

    public Delantero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Delantero");
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad Especial: " + habilidadEspecial);
    }
    
}
