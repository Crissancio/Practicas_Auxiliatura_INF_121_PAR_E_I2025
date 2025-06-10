package ejercicio1;

public class Caja<T> {
 private T contenido;

 public void guardar(T elemento) {
     contenido = elemento;
 }

 public T obtener() {
     return contenido;
 }
}

