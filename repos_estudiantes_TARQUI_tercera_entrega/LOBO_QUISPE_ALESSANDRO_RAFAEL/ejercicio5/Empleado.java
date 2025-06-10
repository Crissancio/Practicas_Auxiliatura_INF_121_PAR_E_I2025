
package ejercicio5;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioBase;
    private int aniosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * aniosAntiguedad);
    }

    public void mostrar() {
        System.out.println(nombre + " " + apellido + " - Salario: " + calcularSalario());
    }
}


