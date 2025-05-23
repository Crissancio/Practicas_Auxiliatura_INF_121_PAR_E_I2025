package ComposicionAgregacion.Ejer5.codigo;

public class Jugador {
    public String nombre;
    public int numero;
    public String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void mostrar_info() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + numero);
        System.out.println("Posición: " + posicion);
    }
    
}
