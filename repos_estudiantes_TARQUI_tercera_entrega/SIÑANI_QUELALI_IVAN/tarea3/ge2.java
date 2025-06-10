public class Par<K, V> {
    private K clave;
    private V valor;
    // Constructor
    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }
    // Método para mostrar el par
    public void mostrarPar() {
        System.out.println("Clave: " + clave + " | Valor: " + valor);
    }
    // Métodos para obtener los valores individualmente
    public K getClave() { return clave; }
    public V getValor() { return valor; }
}
// Clase principal 
public class Main {
    public static void main(String[] args) {
        Par<Integer, String> estudiante = new Par<>(1001, "Juan Pérez");
        estudiante.mostrarPar();

        Par<String, Double> producto = new Par<>("A123", 199.99);
        producto.mostrarPar();
    }
}
//DIAGRAMA
//Clase Par<K, V>
//---------------------------
//- clave: K
//- valor: V
//---------------------------
//+ Par(K clave, V valor)  // Constructor
//+ mostrarPar(): void
//+ getClave(): K
//+ getValor(): V
//---------------------------
//Clase Main
//---------------------------
//+ main(String[] args): void
//---------------------------