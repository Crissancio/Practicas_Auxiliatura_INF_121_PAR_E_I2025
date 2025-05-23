
package Ejercicio05;

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

    public double calcular_salario() {
        return salarioBase + (salarioBase * 0.05 * añosAntiguedad);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Años de antigüedad: " + añosAntiguedad);
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public double getSalarioBase() { return salarioBase; }
    public int getAñosAntiguedad() { return añosAntiguedad; }
}
