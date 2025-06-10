package generacidad;

//a)
import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
 private List<T> elementos = new ArrayList<>();

 public void apilar(T elemento) {
     elementos.add(elemento);
 }

 // b)
 public T desapilar() {
     if (!elementos.isEmpty()) {
         return elementos.remove(elementos.size() - 1);
     }
     return null;
 }

 // d)
 public void mostrar() {
     System.out.println("Contenido de la pila: " + elementos);
 }
}
