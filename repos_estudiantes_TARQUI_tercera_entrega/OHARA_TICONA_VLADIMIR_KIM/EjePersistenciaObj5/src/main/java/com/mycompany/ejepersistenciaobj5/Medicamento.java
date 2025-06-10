package com.mycompany.ejepersistenciaobj5;
/**
 *
 * @author Usuario
 */
public class Medicamento {

    String nombre;
    int codMedicamento;
    String tipo;
    double precio;

    public Medicamento(String nombre, int codMedicamento, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = codMedicamento;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Tipo: " + tipo + ", Precio: " + precio);
    }
}
