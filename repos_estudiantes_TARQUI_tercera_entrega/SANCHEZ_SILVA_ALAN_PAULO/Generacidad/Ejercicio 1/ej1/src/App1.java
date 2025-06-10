public class App1 {
    public static void main(String[] args) throws Exception {
        //b)
        Caja <Integer> numero = new Caja<>();
        numero.guardar(130);
        
        Caja <String> nombre = new Caja<>();
        nombre.guardar("Marco José Espejo Miranda");

        //c)
        System.out.println("Caja de numeros:"+ numero.obtener());
        System.out.println("Caja de nombres:" + nombre.obtener());
    }
}
