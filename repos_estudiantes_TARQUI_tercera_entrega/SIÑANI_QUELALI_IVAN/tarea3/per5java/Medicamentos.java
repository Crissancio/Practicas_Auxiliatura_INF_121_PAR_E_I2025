import java.io.Serializable;
public class Medicamento implements Serializable {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;
    // Constructor
    public Medicamento(String nombre, int codMedicamento, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = codMedicamento;
        this.tipo = tipo;
        this.precio = precio;
    }
    // Getters
    public String getNombre() { return nombre; }
    public int getCodMedicamento() { return codMedicamento; }
    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return "Medicamento: " + nombre + " | Código: " + codMedicamento + " | Tipo: " + tipo + " | Precio: " + precio;
    }
}
