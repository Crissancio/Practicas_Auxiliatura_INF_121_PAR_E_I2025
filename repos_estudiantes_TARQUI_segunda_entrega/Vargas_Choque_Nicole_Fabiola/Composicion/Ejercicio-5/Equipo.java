import java.util.*;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    
    public Equipo(String n)
    {
        this.nombre=n;
        this.jugadores=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void agregarJugador(Jugador j)
    {
        jugadores.add(j);
    }
    
    public void mostrarEquipo()
    {
        System.out.println("------------------NOMBRE DEL EQUIPO------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("------------------------------------------------");
        System.out.println("Jugadores: ");
        for(Jugador j: jugadores)
        {
            j.mostrarInfo();
        }
    }
}

class Jugador {
    private String nombre, posición;
    private int numero;
    
    public Jugador(String n, int nu, String p)
    {
        this.nombre=n;
        this.numero=nu;
        this.posición=p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void mostrarInfo()
    {
        System.out.println("Nombre: "+nombre+" "+"Numero: "+numero);
        System.out.println("Posicion: "+posición);
    }
}

class Portero extends Jugador{
    private String habilidadEspecial;
    
    public Portero(String n, int nu, String p, String h)
    {
        super(n, nu, p);
        this.habilidadEspecial=h;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    
    public void mostrar()
    {
        super.mostrarInfo();
        System.out.println("Habilidad Especial: "+habilidadEspecial);
    }
}

class Delantero extends Jugador{
    private String habilidadEspecial;
    
    public Delantero(String n, int nu, String p, String h)
    {
        super(n, nu, p);
        this.habilidadEspecial=h;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    
    public void mostrar()
    {
        super.mostrarInfo();
        System.out.println("Habilidad Especial: "+habilidadEspecial);
    }
}

class Defensa extends Jugador{
    private String habilidadEspecial;
    
    public Defensa(String n, int nu, String p, String h)
    {
        super(n, nu, p);
        this.habilidadEspecial=h;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    
    public void mostrar()
    {
        super.mostrarInfo();
        System.out.println("Habilidad Especial: "+habilidadEspecial);
    }
}

class Mediocampista extends Jugador{
    private String habilidadEspecial;
    
    public Mediocampista(String n, int nu, String p, String h)
    {
        super(n, nu, p);
        this.habilidadEspecial=h;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    
    public void mostrar()
    {
        super.mostrarInfo();
        System.out.println("Habilidad Especial: "+habilidadEspecial);
    }
}

class App {
    public static void main(String[] args) {
        
        Equipo e1=new Equipo("Fadicons");
        
        Portero p=new Portero("Carlos Perez", 1, "Portero", "Atajadas");
        Defensa d=new Defensa("Luis Garcia", 4, "Defensa", "Marcaje");
        Delantero de=new Delantero("Ana Torres", 10, "Delantero", "Goles decisivos");
        Mediocampista m=new Mediocampista("Sofia Rios", 8, "Mediocampista", "Pases precisos");
        
        e1.agregarJugador(p);        
        e1.agregarJugador(d);
        e1.agregarJugador(de);
        e1.agregarJugador(m);
        
        e1.mostrarEquipo();
    }
}