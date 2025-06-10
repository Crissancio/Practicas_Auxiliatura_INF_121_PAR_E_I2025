/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medicamento;
public class Medicamento {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;

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

    public String getNombre() {
        return nombre;
    }

    public void mostrar() {
        System.out.println("Medicamento: " + nombre + ", Código: " + codMedicamento +
                           ", Tipo: " + tipo + ", Precio: " + precio);
    }

    public String toArchivo() {
        return nombre + "," + codMedicamento + "," + tipo + "," + precio;
    }

    public static Medicamento fromArchivo(String linea) {
        String[] p = linea.split(",");
        return new Medicamento(p[0], Integer.parseInt(p[1]), p[2], Double.parseDouble(p[3]));
    }
}
