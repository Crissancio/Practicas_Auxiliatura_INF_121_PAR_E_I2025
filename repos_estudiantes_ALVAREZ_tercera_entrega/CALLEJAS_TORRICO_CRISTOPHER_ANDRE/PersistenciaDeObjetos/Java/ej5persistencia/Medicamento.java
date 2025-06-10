package ej5persistencia;

public class Medicamento {
    private String nombre;
    private String tipo;

    public Medicamento() {}

    public Medicamento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Medicamento: " + nombre + ", Tipo: " + tipo;
    }
}
