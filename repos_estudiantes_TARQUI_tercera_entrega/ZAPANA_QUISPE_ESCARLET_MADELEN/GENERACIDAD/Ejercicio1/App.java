package Generacidaduno;

/**
 *
 * @author ESCARLET
 */
public class App {
    public static void main(String[] args) {
        Caja<Integer> caja1=new Caja<>();
        Caja<String> Cj2=new Caja<> ();
        Caja<Double> Cj3=new Caja<> ();
        caja1.guardar(186);
        Cj2.guardar("Adios Mundo");
        Cj3.guardar(4825.654);
        System.out.println("Contenido de caja uno "+caja1.obtener());
        System.out.println("Contenido de caja dos "+Cj2.obtener());
        System.out.println("Contenido de caja tres "+Cj3.obtener());
    }
    
}
