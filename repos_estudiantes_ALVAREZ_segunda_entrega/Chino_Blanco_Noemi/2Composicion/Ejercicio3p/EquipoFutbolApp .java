import java.util.ArrayList;

public class EquipoFutbolApp {

   
    static class Jugador {
        private String nombre;
        private int numero;
        private String posicion;

        public Jugador(String nombre, int numero, String posicion) {
            this.nombre = nombre;
            this.numero = numero;
            this.posicion = posicion;
        }

        public String getNombre() { return nombre; }
        public int getNumero() { return numero; }
        public String getPosicion() { return posicion; }

        public void setNombre(String nombre) { this.nombre = nombre; }
        public void setNumero(int numero) { this.numero = numero; }
        public void setPosicion(String posicion) { this.posicion = posicion; }

        public void mostrarInfo() {
            System.out.println(nombre + " | #" + numero + " | Posición: " + posicion);
        }
    }

    static class Portero extends Jugador {
        private String habilidadEspecial;

        public Portero(String nombre, int numero, String habilidadEspecial) {
            super(nombre, numero, "Portero");
            this.habilidadEspecial = habilidadEspecial;
        }

        public String getHabilidadEspecial() { return habilidadEspecial; }
        public void setHabilidadEspecial(String habilidadEspecial) { this.habilidadEspecial = habilidadEspecial; }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("  Habilidad Especial: " + habilidadEspecial);
        }
    }

    static class Defensa extends Jugador {
        private String habilidadEspecial;

        public Defensa(String nombre, int numero, String habilidadEspecial) {
            super(nombre, numero, "Defensa");
            this.habilidadEspecial = habilidadEspecial;
        }

        public String getHabilidadEspecial() { return habilidadEspecial; }
        public void setHabilidadEspecial(String habilidadEspecial) { this.habilidadEspecial = habilidadEspecial; }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println(" ️ Habilidad Especial: " + habilidadEspecial);
        }
    }

    static class Mediocampista extends Jugador {
        private String habilidadEspecial;

        public Mediocampista(String nombre, int numero, String habilidadEspecial) {
            super(nombre, numero, "Mediocampista");
            this.habilidadEspecial = habilidadEspecial;
        }

        public String getHabilidadEspecial() { return habilidadEspecial; }
        public void setHabilidadEspecial(String habilidadEspecial) { this.habilidadEspecial = habilidadEspecial; }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println(" ️ Habilidad Especial: " + habilidadEspecial);
        }
    }

    static class Delantero extends Jugador {
        private String habilidadEspecial;

        public Delantero(String nombre, int numero, String habilidadEspecial) {
            super(nombre, numero, "Delantero");
            this.habilidadEspecial = habilidadEspecial;
        }

        public String getHabilidadEspecial() { return habilidadEspecial; }
        public void setHabilidadEspecial(String habilidadEspecial) { this.habilidadEspecial = habilidadEspecial; }

        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("  Habilidad Especial: " + habilidadEspecial);
        }
    }

    
    static class Equipo {
        private String nombre;
        private ArrayList<Jugador> jugadores;

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
            System.out.println("Equipo: " + nombre);
            System.out.println("Jugadores:");
            for (Jugador jugador : jugadores) {
                jugador.mostrarInfo();
                System.out.println("---------------");
            }
        }
    }

    
    public static void main(String[] args) {
        System.out.println(" Noemí Chino Blanco\n");

        Equipo equipo = new Equipo("BOLIVAR");

        
        equipo.agregarJugador(new Portero("noemi chino", 1, "Atajadas "));
        equipo.agregarJugador(new Defensa("jose alejandro", 3, "Marcaje "));
        equipo.agregarJugador(new Mediocampista("yamil luis", 8, "Pases"));
        equipo.agregarJugador(new Delantero("maria juanita", 9, "Goles de Cabeza"));

       
        equipo.mostrarEquipo();
    }
}
