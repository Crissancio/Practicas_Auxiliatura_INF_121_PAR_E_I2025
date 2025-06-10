package GENERECIDAD.Ejercicio2.Java;

public class Par<K, V> {
    private final K clave;
    private final V valor;

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public void mostrarPar() {
        System.out.println("Clave: " + clave + ", Valor: " + valor);
    }
}
