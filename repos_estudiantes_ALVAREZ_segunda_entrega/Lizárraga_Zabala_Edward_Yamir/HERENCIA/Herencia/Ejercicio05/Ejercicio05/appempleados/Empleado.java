
package appempleados;

public class Empleado {
    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected int añosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int añosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosAntiguedad = añosAntiguedad;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * añosAntiguedad);
    }

    public String mostrarInfo() {
        return nombre + " " + apellido + " - Base: " + salarioBase + " - Anios: " + añosAntiguedad;
    }
}

