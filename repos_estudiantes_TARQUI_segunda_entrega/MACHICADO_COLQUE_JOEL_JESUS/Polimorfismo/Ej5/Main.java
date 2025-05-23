package Polimorfismo.Ej5;

public class Main {
    public static void main(String[] args) {
        Oficina o1 = new Oficina(4, 2, 1);
        Oficina o2 = new Oficina(6, 3, 2);

        Aula a1 = new Aula("Aula 101", 30, 30);
        Aula a2 = new Aula("Aula 202", 40, 35);

        Laboratorio lab = new Laboratorio("Lab Computación", 25, 10, 25);

        // Mostrar datos
        o1.mostrar();
        o2.mostrar();
        a1.mostrar();
        a2.mostrar();
        lab.mostrar();

        // Mostrar cantidad de muebles
        System.out.println("Muebles Oficina 1: " + o1.cantidadMuebles());
        System.out.println("Muebles Aula 1 (+5 extra): " + a1.cantidadMuebles(5));
        System.out.println("Muebles Laboratorio: " + lab.cantidadMuebles());
    }
}
