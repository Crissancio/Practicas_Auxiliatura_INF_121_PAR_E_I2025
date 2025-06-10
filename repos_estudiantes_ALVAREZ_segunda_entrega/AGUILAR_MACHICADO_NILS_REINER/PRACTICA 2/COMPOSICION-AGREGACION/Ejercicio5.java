import java.util.ArrayList;

class Jugador {
    protected String nombre;
    protected int numero;
    protected String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public String mostrarInfo() {
        return "Jugador: " + nombre + " (#" + numero + ") - Posición: " + posicion;
    }
}

class Portero extends Jugador {
    private String habilidadEspecial;

    public Portero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Portero");
        this.habilidadEspecial = habilidadEspecial;
    }

    public String mostrarInfo() {
        return super.mostrarInfo() + ", Habilidad: " + habilidadEspecial;
    }
}

class Defensa extends Jugador {
    private String habilidadEspecial;

    public Defensa(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Defensa");
        this.habilidadEspecial = habilidadEspecial;
    }

    public String mostrarInfo() {
        return super.mostrarInfo() + ", Habilidad: " + habilidadEspecial;
    }
}

class Mediocampista extends Jugador {
    private String habilidadEspecial;

    public Mediocampista(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Mediocampista");
        this.habilidadEspecial = habilidadEspecial;
    }

    public String mostrarInfo() {
        return super.mostrarInfo() + ", Habilidad: " + habilidadEspecial;
    }
}

class Delantero extends Jugador {
    private String habilidadEspecial;

    public Delantero(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Delantero");
        this.habilidadEspecial = habilidadEspecial;
    }

    public String mostrarInfo() {
        return super.mostrarInfo() + ", Habilidad: " + habilidadEspecial;
    }
}

class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        for (Jugador j : jugadores) {
            System.out.println(j.mostrarInfo());
        }
    }
}
// SIN GETTERS NI SETTERS
class TestEquipo {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Tigres FC");
        equipo.agregarJugador(new Portero("Carlos", 1, "Atajadas"));
        equipo.agregarJugador(new Defensa("Luis", 4, "Marcaje"));
        equipo.agregarJugador(new Mediocampista("Mario", 8, "Pases"));
        equipo.agregarJugador(new Delantero("Jorge", 9, "Goles"));

        equipo.mostrarEquipo();
    }
}