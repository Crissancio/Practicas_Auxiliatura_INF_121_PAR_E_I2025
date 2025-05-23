package defin;

public class Empleado {
    protected String nombre, apellido;
    protected double salarioBase;
    protected int añosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int añosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosAntiguedad = añosAntiguedad;
    }

    public double calcularSalario() {
        return salarioBase * (1 + 0.05 * añosAntiguedad);
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
}
