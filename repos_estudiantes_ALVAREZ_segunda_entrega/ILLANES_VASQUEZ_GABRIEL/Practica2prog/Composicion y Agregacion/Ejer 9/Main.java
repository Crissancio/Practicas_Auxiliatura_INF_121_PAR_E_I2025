package Lenny;

public class Ejercicio1Composicionprac2 {

    public static void main(String[] args) {
        Casa c1 = new Casa();
        c1.mostrar_casa();

        System.out.println("");
        System.out.println("Agregando");

        c1.agregar(new Habitacion("Dormitorio de la bebé", "2"));
        c1.agregar(new Habitacion("Dormitorio de los padres", "3"));
        c1.agregar(new Habitacion("Dormitorio del hijo mayor", "2.3"));
        c1.agregar(new Habitacion("Dormitorio del hijo del medio", "2.3"));
        c1.agregar(new Habitacion("Dormitorio del último hijo", "2.4"));
        c1.agregar(new Habitacion("Lavandería", "2"));

        c1.mostrar_casa();
    }
}
