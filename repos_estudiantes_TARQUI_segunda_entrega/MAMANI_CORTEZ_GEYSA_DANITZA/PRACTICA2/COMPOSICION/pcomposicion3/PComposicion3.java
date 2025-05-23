/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposicion3;

/**
 *
 * @author Administrador
 */
public class PComposicion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // b) Crear un equipo e incorporar jugadores de distintos tipos
        Equipo tigres = new Equipo("Alaways Ready");

        tigres.agregarJugador(new Portero("Luis García","Portero", "Atajadas felinas",1));
        tigres.agregarJugador(new Defensa("Carlos Reyes", "Defensa","Marcaje férreo",3));
        tigres.agregarJugador(new Defensa("Marcos Díaz",    "Defensa",  "Despejes aéreos",5));
        tigres.agregarJugador(new MedioCampista("Iván Rojas",    "Medio campista",  "Pases filtrados",8));
        tigres.agregarJugador(new MedioCampista("Bruno Silva",   "Medio campista",  "Visión de juego",10));
        tigres.agregarJugador(new Delantero("Tomás Pérez",  "Delantero",  "Olfato goleador",11));

        // c) Mostrar toda la información
        tigres.mostrarInfo();
    }
}
