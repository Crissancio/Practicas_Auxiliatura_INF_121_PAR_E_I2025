package generecidad;

//a)
public class Caja<T> {
 private T contenido;

 public void guardar(T objeto) {
     this.contenido = objeto;
 }

 public T obtener() {
     return contenido;
 }
}
