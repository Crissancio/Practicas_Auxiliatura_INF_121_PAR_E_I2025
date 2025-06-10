package PERSISTENCIA_DE_OBJETOS.EJER_5;

import java.io.Serializable;

public class Medicamento implements Serializable {
    String nombre;
    int codMedicamento;
    String tipo;
    double precio;

    public Medicamento(String nombre, int cod, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = cod;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "nombre='" + nombre + '\'' +
                ", codigo=" + codMedicamento +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio + '}';
    }
}
