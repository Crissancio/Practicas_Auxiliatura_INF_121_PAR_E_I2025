public class App5 {
    public static void main(String[] args) throws Exception {
        /*El codigo funciona usando creando la pila simplemente como 
            Pila pila = new Pila();
            y se pueden almacenar dferentes tipos de datos en esa pila, pero salta una advertencia que como se trata de 
            una pila genérica debemos instanciar la pila como:
                Pila<TIPO DE DATO> pila = new Pila<>();
            puse ambas compilaciones en este ejercicio ya que en un inciso pedia probar la pila con diferentes tipos de datos.
         */

        // Pila  pila = new Pila();

        //c)
        Pila <Integer> pila = new Pila<>();
        Pila <String> pila_strings = new Pila<>();
        Pila <Double> pila_doubles = new Pila<>();

        pila.apilar(2);
        pila.apilar(120);
        pila.apilar(321);

        //d)
        pila.mostrar();

        System.out.println("Desapilando la pila...");
        pila.desapilar();
        pila.mostrar();
    }
}
