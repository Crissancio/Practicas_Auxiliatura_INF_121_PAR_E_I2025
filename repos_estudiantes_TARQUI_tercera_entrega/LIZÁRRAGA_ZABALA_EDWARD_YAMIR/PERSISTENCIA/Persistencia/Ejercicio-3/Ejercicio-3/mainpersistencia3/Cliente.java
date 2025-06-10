
package mainpersistencia3;

import java.io.Serializable;

public class Cliente implements Serializable {
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

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Telefono: " + telefono;
    }
}

