//a)
public class Jugador {
    private String nombre;
    private int numero;
    private String posicion;
    
    public Jugador(String n, int num, String p) {
        this.nombre = n;
        this.numero = num;
        this.posicion = p;
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
        System.out.println("nombre: " + nombre);
        System.out.println("número: " + numero);
        System.out.println("posición: " + posicion);
    }
}