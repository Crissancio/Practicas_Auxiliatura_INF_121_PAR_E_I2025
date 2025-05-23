import java.util.ArrayList;
class Jugador {
    public String nombre;
    public int numero;
    public String posicion;
    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }
    public void mostrar() {
        System.out.println("Jugador: " + nombre + ", Número: " + numero + ", Posición: " + posicion);
    }
}
class Portero extends Jugador {
    public String habilidad;
    public Portero(String nombre, int numero) {
        super(nombre, numero, "Portero");
        this.habilidad = "Atajadas";
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Habilidad especial: " + habilidad);
    }
}
class Defensa extends Jugador {
    public String habilidad;
    public Defensa(String nombre, int numero) {
        super(nombre, numero, "Defensa");
        this.habilidad = "Marcaje";
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Habilidad especial: " + habilidad);
    }
}
class Mediocampista extends Jugador {
    public String habilidad;
    public Mediocampista(String nombre, int numero) {
        super(nombre, numero, "Mediocampista");
        this.habilidad = "Pases";
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Habilidad especial: " + habilidad);
    }
}
class Delantero extends Jugador {
    public String habilidad;
    public Delantero(String nombre, int numero) {
        super(nombre, numero, "Delantero");
        this.habilidad = "Goles";
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Habilidad especial: " + habilidad);
    }
}
class Equipo {
    public String nombre;
    public ArrayList<Jugador> jugadores;
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    public void agregar(Jugador jugador) {
        jugadores.add(jugador);
    }
    public void mostrar() {
        System.out.println("Equipo: " + nombre);
        for (Jugador j : jugadores) {
            j.mostrar();
            System.out.println();
        }
    }
}
public class Ej5 {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Los Invencibles");
        equipo.agregar(new Portero("Juan", 1));
        equipo.agregar(new Defensa("Carlos", 2));
        equipo.agregar(new Mediocampista("Luis", 6));
        equipo.agregar(new Delantero("Pedro", 9));
        equipo.mostrar();
    }
}
