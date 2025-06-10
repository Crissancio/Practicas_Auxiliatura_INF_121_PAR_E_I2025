//1. Crea una clase genérica Caja<T> para guardar algún tipo de objeto
public class Ejercicio1 {
    public static class Caja<T> {
        private T objeto;
// Método para guardar el objeto
    public void guardar(T objeto) {
        this.objeto = objeto;
    }
// Método para obtener el objeto
    public T obtener() {
        return this.objeto;
    }
}
public static void main(String[] args) {
//b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
//c) Muestra el contenido de las cajas   
    Caja<String> cajaString = new Caja<>();
    cajaString.guardar("Fardo Americano");
    System.out.println("Contenido de caja 1: " + cajaString.obtener());

    Caja<Integer> cajaInteger = new Caja<>();
    cajaInteger.guardar(1250);
    System.out.println("Contenido de caja 2: " + cajaInteger.obtener() + "Bs");
  }
}