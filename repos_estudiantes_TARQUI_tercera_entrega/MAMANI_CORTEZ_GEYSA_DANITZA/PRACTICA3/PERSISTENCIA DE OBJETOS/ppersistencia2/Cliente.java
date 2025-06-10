/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppersistencia2;

/**
 *
 * @author Administrador
 */
import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre;
    private int telefono,id;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
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
        return "Cliente: " + id +" " + nombre + " " + telefono ;
    }
}

