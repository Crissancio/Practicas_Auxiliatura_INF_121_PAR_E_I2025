// a)
public class Portero extends Jugador {
    
    private String habilidad_especial;
    public Portero(String nombre, int numero, String h) {
        super(nombre, numero, "Portero");
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