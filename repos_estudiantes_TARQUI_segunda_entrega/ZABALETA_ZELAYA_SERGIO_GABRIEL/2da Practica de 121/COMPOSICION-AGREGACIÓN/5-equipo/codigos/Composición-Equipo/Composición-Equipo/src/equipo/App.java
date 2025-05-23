/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipo;

/**
 *
 * @author davin
 */
public class App {
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
