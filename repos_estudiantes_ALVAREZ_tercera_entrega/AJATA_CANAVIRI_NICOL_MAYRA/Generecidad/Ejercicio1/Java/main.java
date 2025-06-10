package Generecidad.Ejercicio1.Java;

public class main {
    public static void main(String[] args) {
        // b) 

        // Instancia 1
        Caja<String> cajaString = new Caja<>(); 
        cajaString.guardar("Hola!");

        // Instancia 2
        Caja<Integer> cajaInteger = new Caja<>(); 
        cajaInteger.guardar(12345);

        // Instancia 3
        Caja<Double> cajaDouble = new Caja<>();
        cajaDouble.guardar(98.765);


        // c)
        System.out.println("--- Contenido de las Cajas ---");
        System.out.println("Caja de String: " + cajaString.obtener() + " (Tipo: " + cajaString.obtener().getClass().getName() + ")");
        System.out.println("Caja de Integer: " + cajaInteger.obtener() + " (Tipo: " + cajaInteger.obtener().getClass().getName() + ")");
        System.out.println("Caja de Double: " + cajaDouble.obtener() + " (Tipo: " + cajaDouble.obtener().getClass().getName() + ")");
        

        System.out.println("\n--- Usando el metodo toString() de la clase Caja ---");
        System.out.println(cajaString);
        System.out.println(cajaInteger);
        System.out.println(cajaDouble);
    }
}
