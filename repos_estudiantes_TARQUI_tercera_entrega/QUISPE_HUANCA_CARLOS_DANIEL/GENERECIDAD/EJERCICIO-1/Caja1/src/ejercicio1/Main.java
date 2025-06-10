package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.guardar(7);
        
        Caja<String> cajaCadena = new Caja<>();
        cajaCadena.guardar("Hola Mundo");
        
        System.out.println(cajaEnteros);
        System.out.println(cajaCadena);
        
    }
}