
package maincaja;
// b) y c) Prueba con 2 datos de diferente tipo
public class MainCaja {
    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola Mundo");  // b) Almacena String

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(123);          // b) Almacena Integer

        // c) Muestra el contenido de las cajas
        System.out.println("Caja de texto: " + cajaTexto.obtener());
        System.out.println("Caja de numero: " + cajaNumero.obtener());
    }
}

