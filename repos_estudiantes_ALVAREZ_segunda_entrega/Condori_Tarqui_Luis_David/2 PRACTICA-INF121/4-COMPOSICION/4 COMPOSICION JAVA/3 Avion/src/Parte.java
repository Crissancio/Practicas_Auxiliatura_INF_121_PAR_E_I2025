// TEMA: COMPOSICIÓN
// Enunciado:
// 3. Modelar un avión y sus partes. El avión está compuesto por partes como el motor, las alas y el tren de aterrizaje.
// Parte<nombre, peso (en kg)>
// Métodos: mostrar_info()
// Avión<modelo, fabricante, partes (lista de objetos de tipo Parte)>
// Métodos: agregar_parte(parte), mostrar_avion()
// Incisos:
// d) Implementa las clases con sus constructores, getters y setters.
// e) Crea un avión y agrega varias partes.
// f) Muestra la información del avión y sus partes.


public class Parte {
    private String nombre;
    private double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("Parte: " + nombre + ", Peso: " + peso + " kg");
    }
}

