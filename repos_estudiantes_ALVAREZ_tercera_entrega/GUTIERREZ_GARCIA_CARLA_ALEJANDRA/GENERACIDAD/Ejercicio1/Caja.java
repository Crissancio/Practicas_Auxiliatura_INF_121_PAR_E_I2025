//Crea una clase genérica Caja<T> para guardar algún tipo de objeto 
public class Caja<T> {
    private T contenido;

    // a) Agrega métodos guardar() y obtener()
    public void guardar(T dato) {
        this.contenido = dato;
    }

    public T obtener() {
        return contenido;
    }

    public static void main(String[] args) {
        // b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
        Caja<String> cTexto = new Caja<>();
        cTexto.guardar("Generacidad practica");

        Caja<Integer> cNumero = new Caja<>();
        cNumero.guardar(45454548);
        // c) Muestra el contenido de las cajas
        System.out.println("Esto muestra texto: " + cTexto.obtener());
        System.out.println("Esto muestra numeros: " + cNumero.obtener());
    }
}
