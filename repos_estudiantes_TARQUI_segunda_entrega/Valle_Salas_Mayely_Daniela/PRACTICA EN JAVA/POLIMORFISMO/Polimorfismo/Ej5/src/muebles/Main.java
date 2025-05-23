package muebles;

public class Main {
    public static void main(String[] args) {
        Oficina oficina1 = new Oficina(10, 5, 3);
        Oficina oficina2 = new Oficina(8, 4, 2);
     
        Aula aula1 = new Aula("Aula 101", 45, 25);
        Aula aula2 = new Aula("Aula 102", 60, 30);
        
        Laboratorio laboratorio1 = new Laboratorio("Laboratorio de Química", 20, 5, 10);
        
        System.out.println("----- Datos de Oficina -----");
        oficina1.mostrar();
        oficina2.mostrar();
        
        System.out.println("\n----- Datos de Aula -----");
        aula1.mostrar();
        aula2.mostrar();
        
        System.out.println("\n----- Datos de Laboratorio -----");
        laboratorio1.mostrar();
        
        System.out.println("\n----- Cantidad Total de Muebles -----");
        System.out.println("Oficina 1: " + oficina1.cantidadMuebles());
        System.out.println("Oficina 2: " + oficina2.cantidadMuebles());
        System.out.println("Aula 1: " + aula1.cantidadMuebles());
        System.out.println("Aula 2: " + aula2.cantidadMuebles());
        System.out.println("Laboratorio: " + laboratorio1.cantidadMuebles());
    }
}