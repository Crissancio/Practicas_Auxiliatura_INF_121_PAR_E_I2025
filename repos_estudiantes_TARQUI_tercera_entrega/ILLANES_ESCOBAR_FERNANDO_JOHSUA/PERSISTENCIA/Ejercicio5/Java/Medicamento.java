package PERSISTENCIA.Ejercicio5.Java;

import java.io.Serializable;

public class Medicamento implements Serializable {
    private String nombre;
    private String tipo;

    public Medicamento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}
