import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Medicamento implements Serializable {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;

    public Medicamento() {
        this("", 0, "", 0.0);
    }

    public Medicamento(String nombre, int codMedicamento, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = codMedicamento;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void leer() {
        // Implementar lectura de datos si es necesario
    }

    public void mostrar() {
        System.out.println("Medicamento: " + nombre + 
                         ", Código: " + codMedicamento + 
                         ", Tipo: " + tipo + 
                         ", Precio: " + precio);
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
