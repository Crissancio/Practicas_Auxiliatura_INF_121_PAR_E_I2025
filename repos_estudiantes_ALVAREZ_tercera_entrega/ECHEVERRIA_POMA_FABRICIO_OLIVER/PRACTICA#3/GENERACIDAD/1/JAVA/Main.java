/*
 * 
 * -----------------------EJERCICIO 1-----------------------
 * 
 * 
 * Crea una clase genérica Caja<T>; para guardar algún tipo de objeto 
 * a) Agrega métodos guardar() y obtener()
 * b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo 
 * c) Muestra el contenido de las cajas
 */
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // b)
        Caja<String> cajaString = new Caja<>();
        System.out.println("Estado inicial: " + cajaString);

        String texto = "Hola soy Luisito Comunica";
        cajaString.guardar(texto);
        System.out.println("Estado después de guardar: " + cajaString + "\n");

        Caja<Integer> cajaNumero = new Caja<>();
        System.out.println("Estado inicial: " + cajaNumero);

        Integer numero = 7;
        cajaNumero.guardar(numero);
        System.out.println("Estado después de guardar: " + cajaNumero + "\n");

        // c)
        System.out.println("Mostrando contenido de las cajas:");
        System.out.println("-".repeat(40));

        Optional<String> contenidoString = cajaString.obtener();
        System.out.println("Contenido de caja_string: " + contenidoString.orElse(null) + 
            " (Tipo: " + (contenidoString.isPresent() ? contenidoString.get().getClass().getSimpleName() : "null") + ")");

        Optional<Integer> contenidoNumero = cajaNumero.obtener();
        System.out.println("Contenido de caja_numero: " + contenidoNumero.orElse(null) + 
            " (Tipo: " + (contenidoNumero.isPresent() ? contenidoNumero.get().getClass().getSimpleName() : "null") + ")");

        System.out.println("¿Caja string está vacía? " + cajaString.estaVacia());
        System.out.println("¿Caja número está vacía? " + cajaNumero.estaVacia());
    }
}
