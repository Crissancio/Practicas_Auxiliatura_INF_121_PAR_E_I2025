package ComposicionAgregacion.Ejer3.codigo;

public class Main {

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
//c) Muestra la información del avión y sus partes.
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", "Boeing");
        Parte parte1 = new Parte("Ala", 2000);
        Parte parte2 = new Parte("Motor", 5000);
        Parte parte3 = new Parte("Tren de aterrizaje", 1500);
        avion.agregarParte(parte1);
        avion.agregarParte(parte2);
        avion.agregarParte(parte3);
        System.out.println("Información del avión:");

        avion.mostrar_info();
    }
    
}
