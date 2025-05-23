/*
Crea un POO de clases para modelar un avión y sus partes. El avión está
compuesto por partes como el motor, las alas y el tren de aterrizaje. Si el avión
se destruye, las partes también se destruyen.
Parte<nombre, peso (en kg)
Métodos: mostrar_info() (muestra el nombre y el peso de la parte)
Avión<modelo, fabricante, partes (lista de objetos de tipo Parte)
Métodos: agregar_parte(parte), mostrar_avión() (muestra el modelo, fabricante
y la información de todas las partes)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea un avión y agrega varias partes.
c) Muestra la información del avión y sus partes.
*/
package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear el avión
        Avion avion = new Avion("Boeing 747", "Boeing");

        // Crear partes
        Parte motor = new Parte("Motor", 2000);
        Parte alaIzquierda = new Parte("Ala Izquierda", 1500);
        Parte alaDerecha = new Parte("Ala Derecha", 1500);
        Parte trenAterrizaje = new Parte("Tren de Aterrizaje", 800);

        // Agregar partes al avión
        avion.agregar_parte(motor);
        avion.agregar_parte(alaIzquierda);
        avion.agregar_parte(alaDerecha);
        avion.agregar_parte(trenAterrizaje);

        // Mostrar información
        avion.mostrar_avion();
    }
}
