package generecidad;


//b) y c)
public class Main {
public static void main(String[] args) {
   // b)
   Caja<String> cajaTexto = new Caja<>();
   cajaTexto.guardar("Hola Mundo");

   Caja<Integer> cajaNumero = new Caja<>();
   cajaNumero.guardar(123);

   // c)
   System.out.println("Caja de texto: " + cajaTexto.obtener());
   System.out.println("Caja de número: " + cajaNumero.obtener());
}
}
