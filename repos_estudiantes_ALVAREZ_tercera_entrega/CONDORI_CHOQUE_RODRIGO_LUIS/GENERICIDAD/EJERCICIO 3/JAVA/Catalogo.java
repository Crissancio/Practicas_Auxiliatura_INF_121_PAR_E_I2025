package ejercicio3;
import java.util.ArrayList;

public class Catalogo<T> {
 private ArrayList<T> elementos = new ArrayList<>();

 public void agregar(T elemento) {
     elementos.add(elemento);
 }

 public boolean buscar(T elemento) {
     return elementos.contains(elemento);
 }

 public void mostrar() {
     for (T elemento : elementos) {
         System.out.println(elemento);
     }
 }
}

