// 5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está compuesto por jugadores, y si el equipo se destruye, los jugadores también se destruyen. Además, los jugadores pueden ser de diferentes tipos (portero, defensa, mediocampista, delantero).
//a) Implementa las clases con sus constructores, getters y setters.
public class Portero extends Jugador {
    private String habilidad_especial;

    Portero(String nombre, int numero, String posicion, String habilidad_especial) {
        super(nombre, numero, posicion);
        this.habilidad_especial = habilidad_especial;
    }

    public String getHabilidad_especial() {
        return this.habilidad_especial;
    }

    public void setHabilidad_especial(String habilidad_especial) {
        this.habilidad_especial = habilidad_especial;
    }
}
