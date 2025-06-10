
package ejercicio3;


public class Ejercicio3 {


    public static void main(String[] args) {
       Avion avion = new Avion("Boeing 747", "Boeing");
        avion.agregarParte(new Parte("Motor", 2000));
        avion.agregarParte(new Parte("Alas", 3500));
        avion.agregarParte(new Parte("Tren de Aterrizaje", 1500));

        avion.mostrarAvion();
    }
    
}
