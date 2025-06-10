package Ejercicio1;
/*
Crea una clase genérica Caja<T> para guardar algún tipo de objeto
a) Agrega métodos guardar() y obtener()
b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
c) Muestra el contenido de las cajas
*/
public class Main {
    public static void main(String[] args) {
        // Crear una caja para un String
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Hola a todos!!!!!");

        // Crear una caja para un Integer
        Caja<Integer> cajaDeNumero = new Caja<>();
        cajaDeNumero.guardar(42);

        // Mostrar el contenido de las cajas
        System.out.println("Contenido de cajaDeTexto: " + cajaDeTexto.obtener());
        System.out.println("Contenido de cajaDeNumero: " + cajaDeNumero.obtener());
    }
}

