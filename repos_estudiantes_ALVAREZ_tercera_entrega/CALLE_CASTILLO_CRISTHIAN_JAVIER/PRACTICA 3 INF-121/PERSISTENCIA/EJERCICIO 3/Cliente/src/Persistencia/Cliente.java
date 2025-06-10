package Persistencia;

import java.io.Serializable;

public class Cliente implements Serializable {
    private int idCliente;
    private String nombre;
    private String celular;
    
    public Cliente(int idCliente, String nombre, String celular) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.celular = celular;
    }
    
    // Getters
    public int getIdCliente() {
        return idCliente;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCelular() {
        return celular;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    @Override
    public String toString() {
        return "Cliente [ID: " + idCliente + ", Nombre: " + nombre + ", Celular: " + celular + "]";
    }
}
