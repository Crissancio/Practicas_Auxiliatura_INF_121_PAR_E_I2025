package herencia;

public class Empleado {
    public String nombre;
    public String apellido;
    public double salarioBase;
    public int añosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int añosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosAntiguedad = añosAntiguedad;
    }

    public double calcularSalario() {
        double bonoAntiguedad = salarioBase * 0.05 * añosAntiguedad;
        return salarioBase + bonoAntiguedad;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void setSalarioBase(double nuevoSalario) {
        this.salarioBase = nuevoSalario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
