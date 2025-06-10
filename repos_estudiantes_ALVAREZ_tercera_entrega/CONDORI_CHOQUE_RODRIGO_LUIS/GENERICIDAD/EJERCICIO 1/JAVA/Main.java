package ejercicio1;

/*Crea una clase genérica Caja&lt;T&gt; para guardar algún tipo de objeto
a) Agrega métodos guardar() y obtener()
b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
c) Muestra el contenido de las cajas*/
public class Main{
 public static void main(String[] args) {
     Caja<String> caja1 = new Caja<>();
     Caja<Integer> caja2 = new Caja<>();

     caja1.guardar("Texto genérico");
     caja2.guardar(100);

     System.out.println("Caja 1 contiene: " + caja1.obtener());
     System.out.println("Caja 2 contiene: " + caja2.obtener());
 }
}
