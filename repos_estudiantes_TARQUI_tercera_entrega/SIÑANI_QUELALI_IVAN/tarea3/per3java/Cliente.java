import java.io.Serializable;

public class Cliente implements Serializable {
    private int id;
    private String nombre;
    private int telefono;
    // Constructor
    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getTelefono() { return telefono; }
    //cliente
    @Override
    public String toString() {
        return "Cliente: " + nombre + " | ID: " + id + " | Teléfono: " + telefono;
    }
}
