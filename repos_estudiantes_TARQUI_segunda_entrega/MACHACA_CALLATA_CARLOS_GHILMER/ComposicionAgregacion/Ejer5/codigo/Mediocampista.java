package ComposicionAgregacion.Ejer5.codigo;

public class Mediocampista extends Jugador {
     private String habilidadEspecial;

    public Mediocampista(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Mediocampista");
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
