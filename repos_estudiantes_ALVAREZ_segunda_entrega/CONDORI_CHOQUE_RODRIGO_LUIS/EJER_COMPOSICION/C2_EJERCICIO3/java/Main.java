/*3.
Crea un POO de clases para modelar un avión y sus partes. El avión está compuesto por partes como el motor, 
las alas y el tren de aterrizaje. Si el avión se destruye, las partes también se destruyen.
Parte<nombre, peso (en kg)
Métodos: mostrar_info() (muestra el nombre y el peso de la parte)
Avión<modelo, fabricante, partes (lista de objetos de tipo Parte)
Métodos: agregar_parte(parte), mostrar_avión() (muestra el modelo, fabricante y la información de todas las partes)
a)
Implementa las clases con sus constructores, getters y setters.
b)
Crea un avión y agrega varias partes.
c)
Muestra la información del avión y sus partes.*/

package C_2;

public class Main {

	public static void main(String[] args) {
		Avion avion = new Avion("Boeing 747", "Boeing");

        avion.agregarParte(new Parte("Motor", 1500));
        avion.agregarParte(new Parte("Ala izquierda", 1200));
        avion.agregarParte(new Parte("Ala derecha", 1200));
        avion.agregarParte(new Parte("Tren de aterrizaje", 800));

        avion.mostrarAvion();

	}

}
