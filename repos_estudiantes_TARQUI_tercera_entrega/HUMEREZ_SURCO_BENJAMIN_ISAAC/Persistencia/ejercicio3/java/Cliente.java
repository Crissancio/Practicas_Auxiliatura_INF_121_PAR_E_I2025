package Persistencia.ejercicio3.java;

class Cliente {
    private int id;
    private String nombre;
    private int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public int getTelefono() {
        return telefono;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Teléfono: " + telefono;
    }
}
