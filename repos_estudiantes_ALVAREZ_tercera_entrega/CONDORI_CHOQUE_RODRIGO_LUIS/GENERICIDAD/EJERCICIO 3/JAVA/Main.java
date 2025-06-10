package ejercicio3;
/*3. Crea una clase genérica Catalogo&lt;T&gt; que almacene productos o libros.
a) Agrega métodos para agregar y buscar elemento
b) Prueba el catálogo con libros
c) Prueba el catálogo con productos*/
public class Main{
 public static void main(String[] args) {
     Catalogo<Libro> catalogo = new Catalogo<>();

     catalogo.agregar(new Libro("Estructuras de Datos"));
     catalogo.agregar(new Libro("POO en Java"));

     catalogo.mostrar();
     System.out.println("¿Existe 'POO en Java'? " + catalogo.buscar(new Libro("POO en Java")));
 }
}
