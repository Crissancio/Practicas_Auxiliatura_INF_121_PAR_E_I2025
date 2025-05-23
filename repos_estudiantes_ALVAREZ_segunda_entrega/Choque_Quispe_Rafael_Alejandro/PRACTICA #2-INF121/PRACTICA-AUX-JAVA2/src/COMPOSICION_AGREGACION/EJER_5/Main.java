package COMPOSICION_AGREGACION.EJER_5;
public class Main{
    public static void main(String[] args) {
        // Crear equipo (composición fuerte)
        Equipo barcelona = new Equipo("FC Barcelona");
        
        Portero terStegen = new Portero("Ter Stegen", 1);
        Defensa araujo = new Defensa("Araujo", 4);
        Mediocampista pedri = new Mediocampista("Pedri", 8);
        Delantero lewandowski = new Delantero("Lewandowski", 9);
        Defensa kounde = new Defensa("Kounde", 23);
        Mediocampista gavi = new Mediocampista("Gavi", 6); 
        // Agregar jugadores al equipo
        barcelona.agregarJugador(terStegen);
        barcelona.agregarJugador(araujo);
        barcelona.agregarJugador(pedri);
        barcelona.agregarJugador(lewandowski);
        barcelona.agregarJugador(kounde);
        barcelona.agregarJugador(gavi);
        // Mostrar información del equipo
        barcelona.mostrarEquipo();
    }
}