//3. Crea un POO de clases para modelar un avión y sus partes. El avión está
//compuesto por partes como el motor, las alas y el tren de aterrizaje. Si el avión
//se destruye, las partes también se destruyen.
//Parte<nombre, peso (en kg)
//Métodos: mostrar_info() (muestra el nombre y el peso de la parte)
//Avión<modelo, fabricante, partes (lista de objetos de tipo Parte)
//Métodos: agregar_parte(parte), mostrar_avión() (muestra el modelo, fabricante
//y la información de todas las partes)
//a) Implementa las clases con sus constructores, getters y setters.
//b) Crea un avión y agrega varias partes.
//c) Muestra la información del avión y sus partes

package ComposicionyAgregacion.ejercicio3.java;

public class Main {
    public static void main(String[] args) {
        Parte motor = new Parte("Motor Rolls-Royce Trent XWB", 600.5);
        Parte alaIzquierda = new Parte("Ala Izquierda", 400.2);
        Parte alaDerecha = new Parte("Ala Derecha", 400.8);
        Parte trenPrincipal = new Parte("Tren de Aterrizaje Principal", 250.0);
        Parte trenNariz = new Parte("Tren de Aterrizaje de Nariz", 120.5);

        Avion miAvion = new Avion("Boeing 787 Dreamliner", "Boeing Commercial Airplanes");
        miAvion.agregarParte(motor);
        miAvion.agregarParte(alaIzquierda);
        miAvion.agregarParte(alaDerecha);
        miAvion.agregarParte(trenPrincipal);
        miAvion.agregarParte(trenNariz);

        miAvion.mostrarAvion();
    }   
}
