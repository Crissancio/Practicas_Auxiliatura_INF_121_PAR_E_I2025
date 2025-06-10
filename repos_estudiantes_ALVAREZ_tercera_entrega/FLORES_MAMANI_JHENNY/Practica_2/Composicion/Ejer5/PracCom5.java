/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac.com5;

/**
 *
 * @author WINDOWS 11
 */
public class PracCom5 {

    public static void main(String[] args) {
        Equipo equipo = new Equipo(" florecitas");
        equipo.agregar_jugador(new Portero("marco", 12, "delantero"));
        equipo.agregar_jugador(new Defensa("pepe", 6, "arqueri"));
        equipo.agregar_jugador(new Mediocampista("alan", 7, "defensa"));
        equipo.agregar_jugador(new Delantero("brito", 9, "Goleador"));
        equipo.mostrar_equipo();
    }
}
