// Enunciado:
// 3. Crea un POO de clases para modelar un avión y sus partes.
// El avión está compuesto por partes como motor, alas y tren de aterrizaje.
// Si el avión se destruye, las partes también se destruyen.
// Parte <nombre, peso (en kg)>
// Métodos: mostrar_info() (muestra el nombre y peso de la parte)
// Avión <modelo, fabricante, partes (lista de objetos de tipo Parte)>
// Métodos: agregar_parte(parte), mostrar_avion() (muestra modelo, fabricante e info de partes)
// a) Implementa las clases con sus constructores, getters y setters.
// b) Crea un avión y agrega varias partes.
// c) Muestra la información del avión y sus partes.

package Ejercicio3;

public class Parte {
    private String nombre;
    private double peso;

    // a) Constructor, getters y setters
    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    // a) Método mostrar_info
    public void mostrarInfo() {
        System.out.println("Parte: " + nombre + " | Peso: " + peso + " kg");
    }
}