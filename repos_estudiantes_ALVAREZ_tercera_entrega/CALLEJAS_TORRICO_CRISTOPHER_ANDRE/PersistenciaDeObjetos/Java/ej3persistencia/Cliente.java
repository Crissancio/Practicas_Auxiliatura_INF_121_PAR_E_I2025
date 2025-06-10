package ej3persistencia;

public class Cliente {
    private int id_cliente;
    private String nombre;
    private String celular;

    public Cliente() {
        
    }

    public Cliente(int id_cliente, String nombre, String celular) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "ID: " + id_cliente + ", Nombre: " + nombre + ", Celular: " + celular;
    }
}
