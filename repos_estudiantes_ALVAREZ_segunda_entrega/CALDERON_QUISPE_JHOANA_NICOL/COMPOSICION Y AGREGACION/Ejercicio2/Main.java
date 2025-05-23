package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Caro", "Jhoana");

        avion.agregarParte("Izquierda", 500.0);
        avion.agregarParte("Motor derecho", 1500.0);
        avion.agregarParte("Cola", 300.0);

        avion.mostrarAvion();
    }
}
