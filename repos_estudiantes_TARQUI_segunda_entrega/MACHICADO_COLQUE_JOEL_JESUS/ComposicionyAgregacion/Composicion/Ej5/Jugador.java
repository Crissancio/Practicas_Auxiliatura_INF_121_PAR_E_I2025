package ComposicionyAgregacion.Composicion.Ej5;

public class Jugador {
    private String nombre;
    private int numero;
    private String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void mostrarInfo() {
        System.out.println("" + nombre + " | #" + numero + " | Posición: " + posicion);
    }
}
