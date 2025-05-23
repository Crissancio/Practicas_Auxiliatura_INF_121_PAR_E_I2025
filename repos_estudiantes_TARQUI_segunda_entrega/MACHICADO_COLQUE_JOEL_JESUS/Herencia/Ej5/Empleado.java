package Herencia.Ej5;

// Clase base
public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioBase;
    private int añosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosAntiguedad = añosAntiguedad;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * añosAntiguedad);
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
