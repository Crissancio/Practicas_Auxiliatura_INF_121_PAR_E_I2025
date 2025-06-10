/*
1. Crea una clase genérica Caja<T> para guardar algún tipo de objeto
*/

package genericidad;

public class Genericidad {

    public static void main(String[] args) {
//b) y c)
        Caja<String> cajaString = new Caja<>();
           cajaString.guardar("Objeto1");
           String contenido = cajaString.obtenter();
           
           System.out.println("El contenido es: " + contenido);
           
           Caja<Integer> cajaEnteros = new Caja<>();
           cajaEnteros.guardar(32);
           Integer numero = cajaEnteros.obtenter();
           
           System.out.println("El contenido es: " + numero);
                   
    }
    
}
