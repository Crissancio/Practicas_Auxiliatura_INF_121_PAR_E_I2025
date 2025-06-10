import java.io.Serializable;
public class Farmacia implements Serializable {
    private String nombre;
    private String zona;
    private int stock;
    public Farmacia(String nombre, String zona, int stock) {
        this.nombre = nombre;
        this.zona = zona;
        this.stock = stock;
    }
    public String getZona() {
        return zona;
    }
    public int getStock() {
        return stock;
    }
    @Override
    public String toString() {
        return "Farmacia: " + nombre + ", Zona: " + zona + ", Stock: " + stock;
    }
}