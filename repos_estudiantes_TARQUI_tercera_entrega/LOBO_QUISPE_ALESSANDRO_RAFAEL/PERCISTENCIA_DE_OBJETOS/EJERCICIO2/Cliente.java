import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Clase Cliente
class Cliente implements Serializable {
    private int id;
    private String nombre;
    private int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getTelefono() { return telefono; }

    @Override
    public String toString() {
        return "Cliente[id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + "]";
    }
}
