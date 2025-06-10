package Generecidad.ejercicio1.java;

public class Main {
    public static void main(String[] args) {
        
        Caja<Integer> cajaEntero = new Caja<>();
        cajaEntero.guardar(123);

        
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola mundo");

        
        System.out.println("Caja de entero: " + cajaEntero.obtener());
        System.out.println("Caja de texto: " + cajaTexto.obtener());
    }
}

