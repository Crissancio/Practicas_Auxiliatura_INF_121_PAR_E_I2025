package EJERCICIO8;

public class Main {
    public static void main(String[] args) {
        
        Oficina oficina1 = new Oficina(10, 5, 2);
        Oficina oficina2 = new Oficina(8, 4, 3);

        Aula aula1 = new Aula("Matemáticas", 30, 20);
        Aula aula2 = new Aula("Ciencias", 25, 15);

        Laboratorio laboratorio = new Laboratorio("Laboratorio de Química", 20, 5, 15);

        
        oficina1.mostrar();
        oficina2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        laboratorio.mostrar();

       
        System.out.println("Cantidad de muebles en oficina 1: " + oficina1.cantidadMuebles());
        System.out.println("Cantidad de muebles en oficina 2: " + oficina2.cantidadMuebles());
        System.out.println("Cantidad de muebles en aula 1: " + aula1.cantidadMuebles());
        System.out.println("Cantidad de muebles en aula 2: " + aula2.cantidadMuebles());
        System.out.println("Cantidad de muebles en laboratorio: " + laboratorio.cantidadMuebles());
    }
}

