package Ejercicio3;

public class Cliente {
    private int id;
    private String nombre;
    private int telefono;

    public Cliente(String nombre, int id, int telefono) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID: " + id + ", Telefono: " + telefono;
    }
}
