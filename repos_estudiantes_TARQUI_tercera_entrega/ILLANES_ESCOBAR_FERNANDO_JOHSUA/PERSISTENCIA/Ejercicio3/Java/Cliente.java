package PERSISTENCIA.Ejercicio3.Java;

import java.io.Serializable;

public class Cliente implements Serializable {
    private int id;
    private String nombre;
    private String celular;

    public Cliente(int id, String nombre, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCelular() { return celular; }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre='" + nombre + '\'' +
               ", celular='" + celular + '\'' + '}';
    }
}
