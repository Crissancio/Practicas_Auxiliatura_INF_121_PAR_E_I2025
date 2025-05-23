// Enunciado:
// 1. Sean las siguientes clases:
// Habitacion <nombre, tamaño (en metros cuadrados)>
// Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
// Casa <dirección, habitaciones (lista de objetos de tipo Habitacion)>
// Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la dirección y la información de todas las habitaciones)
// a) Implementa las clases con sus constructores, getters y setters.
// b) Crea una casa y agrega varias habitaciones.
// c) Muestra la información de la casa y sus habitaciones.

package ejercicio1;

public class Habitacion {
    private String nombre;
    private double tamano;

    // a) Constructor, getters y setters
    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    // a) Método mostrar_info
    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + " | Tamaño: " + tamano + " m²");
    }
}
