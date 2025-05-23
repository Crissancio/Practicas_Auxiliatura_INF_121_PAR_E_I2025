/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER3;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", "Boeing");

        Parte motor = new Parte("Motor", 5000.0);
        Parte alaIzquierda = new Parte("Ala Izquierda", 2000.0);
        Parte alaDerecha = new Parte("Ala Derecha", 2000.0);
        Parte trenAterrizaje = new Parte("Tren de Aterrizaje", 1500.0);

        avion.agregarParte(motor);
        avion.agregarParte(alaIzquierda);
        avion.agregarParte(alaDerecha);
        avion.agregarParte(trenAterrizaje);

        avion.mostrarAvion();
    }
    
}
