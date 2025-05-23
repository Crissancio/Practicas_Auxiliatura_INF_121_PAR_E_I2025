
package Ejercicio5;

public class Jugador {
    protected String nombre;
    protected int numero;
    protected String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + nombre + ", Número: " + numero + ", Posición: " + posicion);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public int getNumero() { return numero; }
    public String getPosicion() { return posicion; }
}

