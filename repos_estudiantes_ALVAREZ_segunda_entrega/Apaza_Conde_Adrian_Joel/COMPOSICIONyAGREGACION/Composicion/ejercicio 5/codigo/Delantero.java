// a)
public class Delantero extends Jugador {
    private String habilidad_especial;
    public Delantero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Delantero");
        this.habilidad_especial = habilidadEspecial;
    }

    public String getHabilidadEspecial() { return habilidad_especial; }
    public void setHabilidadEspecial(String habilidad_especial) { 
        this.habilidad_especial = habilidad_especial; 
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad especial: " + habilidad_especial);
    }
}