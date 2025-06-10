package com.mycompany.ejepersistenciaobj3;
/**
 *
 * @author Vladimir Ohara
 */
public class Cliente {
    int id;
    String nombre;
    int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getTelefono() { return telefono; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Teléfono: " + telefono;
    }
}
