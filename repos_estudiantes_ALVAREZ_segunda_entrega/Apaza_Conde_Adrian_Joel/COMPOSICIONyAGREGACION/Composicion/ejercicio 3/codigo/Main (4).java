/*
 3. Crea un POO de clases para modelar un avión y sus partes. El avión está 
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
public class Main {
    public static void main(String[] args) {
        // b) 
        Avión a1 = new Avión("747", "Boeing");
        // b) creando partes del avión
        Parte p1 = new Parte("Ala derecha", 1200.5);
        Parte p2 = new Parte("Ala izquierda ", 1200.5);
        Parte p3 = new Parte("Motor derecho", 2500.0);
        Parte p4 = new Parte("Motor izquierdo ", 2500.0);
        Parte p5 = new Parte("Tren de aterrizaje", 1800.75);
        // b)  Agregando partes al avión
        a1.agregar_parte(p1);
        a1.agregar_parte( p2 );
        a1.agregar_parte(p3);
        a1.agregar_parte(p4);
        a1.agregar_parte(p5);
        // c) 
        a1.mostrar_avion();
    }
}