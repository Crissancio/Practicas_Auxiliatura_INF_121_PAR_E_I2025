/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer5compo;

/**
 *
 * @author CINTHIA
 */
public class Ejer5Compo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo e1=new Equipo("Tigre");
        e1.agregarjugador(new Portero("Cralos",3,"Atajadas"));
        e1.agregarjugador(new Defensa("Luis",6,"Marcaje"));
        e1.agregarjugador(new Mediocampista("Pedro", 8, "Pases"));
        e1.agregarjugador(new Delantero("Juan", 10, "Goles"));
        e1.mostrarE();
    }
    
}
