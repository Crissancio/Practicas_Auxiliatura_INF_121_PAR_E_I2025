package COMPOSICION_AGREGACION.EJER_5;
public class Jugador {
    private String nombre;
    private int numero;
    private String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero: " + numero);
        System.out.println("Posicion: " + posicion);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }
}