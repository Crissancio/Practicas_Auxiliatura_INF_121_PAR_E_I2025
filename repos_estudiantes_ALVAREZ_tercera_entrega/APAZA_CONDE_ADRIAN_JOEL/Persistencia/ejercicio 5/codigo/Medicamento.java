package p3.ejer5.per;
public class Medicamento {
    public String nombre;
    public int codMedicamento;
    public String tipo;
    public double precio;

    public Medicamento() {}

    public Medicamento(String n, int codM, String t, double p) {
        this.nombre = n;
        this.codMedicamento = codM;
        this.tipo = t;
        this.precio = p;
    }

    public void leer() {
        
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
}
