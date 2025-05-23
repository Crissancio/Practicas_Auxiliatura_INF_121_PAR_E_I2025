package Herencia;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioBase;
    private int añosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int añosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosAntiguedad = añosAntiguedad;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public double getSalarioBase() { return salarioBase; }
    public int getAñosAntiguedad() { return añosAntiguedad; }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public double calcularSalario() {
        double bono = salarioBase * 0.05 * añosAntiguedad;
        return salarioBase + bono;
    }
}

