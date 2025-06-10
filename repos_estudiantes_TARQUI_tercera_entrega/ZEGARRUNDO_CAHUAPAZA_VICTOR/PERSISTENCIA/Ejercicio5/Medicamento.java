package Ejercicio5;

public class Medicamento {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;

    public Medicamento() {}

    public void leer(String nombre, int codigo, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = codigo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Código: " + codMedicamento + ", Tipo: " + tipo + ", Precio: " + precio);
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}