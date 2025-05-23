import java.util.ArrayList;
import java.util.List;

class Jugador {
    private String nombre;
    private int numero;
    private String posicion;
    private String habilidadEspecial;

    public Jugador(String nombre, int numero, String posicion, String habilidadEspecial) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
        this.habilidadEspecial = habilidadEspecial;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Número: " + numero + ", Posición: " + posicion);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    public String getHabilidadEspecial() { return habilidadEspecial; }
    public void setHabilidadEspecial(String habilidadEspecial) { this.habilidadEspecial = habilidadEspecial; }
}

class Portero extends Jugador {
    public Portero(String nombre, int numero) {
        super(nombre, numero, "Portero", "Ataja");
    }
}

class Defensa extends Jugador {
    public Defensa(String nombre, int numero) {
        super(nombre, numero, "Defensa", "Marcaje");
    }
}

class Mediocampista extends Jugador {
    public Mediocampista(String nombre, int numero) {
        super(nombre, numero, "Mediocampista", "Pases");
    }
}

class Delantero extends Jugador {
    public Delantero(String nombre, int numero) {
        super(nombre, numero, "Delantero", "Goles");
    }
}

class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarEquipo() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("Jugadores:");
        for (Jugador jugador : jugadores) {
            jugador.mostrarInfo();
        }
    }
}

public class Aplicacion {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Los Invencibles");

        equipo1.agregarJugador(new Portero("Carlos Pérez", 1));
        equipo1.agregarJugador(new Defensa("Pols Torres", 4));
        equipo1.agregarJugador(new Defensa("Rom Gómez", 5));
        equipo1.agregarJugador(new Mediocampista("Juan Rivera", 8));
        equipo1.agregarJugador(new Mediocampista("Pedro Lopez", 10));
        equipo1.agregarJugador(new Delantero("Miguel Terceros", 9));

        equipo1.mostrarEquipo();
    }
}