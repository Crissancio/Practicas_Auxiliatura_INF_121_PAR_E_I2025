// TEMA: COMPOSICIÓN
// Enunciado:
// 1. Sean las siguientes clases:
// Habitación<nombre, tamaño (en metros cuadrados)>
// Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
// Casa<dirección, habitaciones (lista de objetos de tipo Habitación)>
// Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la dirección y la información de todas las habitaciones)
// Incisos:
// a) Implementa las clases con sus constructores, getters y setters.
// b) Crea una casa y agrega varias habitaciones.
// c) Muestra la información de la casa y sus habitaciones.


class Habitacion {
    private String nombre;
    private double tamano;

    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m²");
    }
}

