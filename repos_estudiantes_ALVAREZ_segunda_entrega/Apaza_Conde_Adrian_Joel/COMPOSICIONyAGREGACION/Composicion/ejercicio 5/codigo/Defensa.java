// a)
public class Defensa extends Jugador {
    private String habilidad_especial;
    public Defensa(String nombre, int numero, String h) {
        super(nombre, numero, "Defensa");
        this.habilidad_especial = h;
    }

    public String getHabilidadEspecial() { 
        return habilidad_especial; 
    }
    public void setHabilidadEspecial(String habilidad_especial) { 
        this.habilidad_especial = habilidad_especial; 
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Habilidad especial: " + habilidad_especial);
    }
}