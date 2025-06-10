package Generecidad.Ejer1.codigo;

//1. Crea una clase genérica Caja<T> para guardar algún tipo de objeto
//a) Agrega métodos guardar() y obtener()
//b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
//c) Muestra el contenido de las cajas


public class Main {
    public static void main(String[] args) {
       Caja<String> caja1 = new Caja<>();
       caja1.guardar("chocolates");
       String contenido1 = caja1.obtener();
       System.out.println("Contenido de caja1: " + contenido1);

       Caja<Integer> caja2 = new Caja<>();
       caja2.guardar(7);
       Integer contenido2 = caja2.obtener();
       System.out.println("Contenido de caja2: " + contenido2);

    }
}