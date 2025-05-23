package Ejercicio5;

public class Jugador {
    private String nombre;
    private int numero;
    private String posicion;

    public Jugador(String n, int num, String pos) {
        this.nombre = n;
        this.numero = num;
        this.posicion = pos;
    }

    public void mostrar_info() {
        System.out.println("Nombre: " + this.nombre + ", Numero: " + this.numero + ", Posicion: " + this.posicion);
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

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public void setPosicion(String pos) {
        this.posicion = pos;
    }
}
