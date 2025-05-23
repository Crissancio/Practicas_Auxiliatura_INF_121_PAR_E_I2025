package HERENCIA.EJER_5;
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
     public double calcularSalario() {
        double bonoAntiguedad = salarioBase * 0.05 * añosAntiguedad;
        return salarioBase + bonoAntiguedad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }
}