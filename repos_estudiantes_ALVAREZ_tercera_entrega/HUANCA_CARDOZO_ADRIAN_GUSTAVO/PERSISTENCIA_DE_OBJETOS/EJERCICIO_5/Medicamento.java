package PERSISTENCIA_DE_OBJETOS.EJERCICIO_5;
import java.io.Serializable;

public class Medicamento implements Serializable {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;

    public Medicamento() {}

    public void leer(String nombre, int codMedicamento, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = codMedicamento;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Codigo: " + codMedicamento + ", Tipo: " + tipo + ", Precio: " + precio);
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
