/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Fabricio
 * 1. Sean las siguientes clases:
Habitación<nombre, tamaño (en metros cuadrados)
Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
Casa<dirección, habitaciones (lista de objetos de tipo Habitación)
Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la
dirección y la información de todas las habitaciones)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una casa y agrega varias habitaciones.
c) Muestra la información de la casa y sus habitaciones.
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Casa casa = new Casa("Av. Siempre Viva #742");
        casa.agregar_habitacion(new Habitacion("Sala", 25));
        casa.agregar_habitacion(new Habitacion("Cocina", 15));
        casa.agregar_habitacion(new Habitacion("Dormitorio", 20));

        casa.mostrar_casa();
    }
}