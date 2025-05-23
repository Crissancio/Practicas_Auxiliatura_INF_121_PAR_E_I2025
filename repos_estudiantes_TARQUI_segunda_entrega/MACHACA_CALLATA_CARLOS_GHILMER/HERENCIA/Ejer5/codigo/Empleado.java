package HERENCIA.Ejer5.codigo;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salario_base;
    private int años_antiguedad;

    public Empleado(String nombre, String apellido, double salario_base, int años_antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario_base = salario_base;
        this.años_antiguedad = años_antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalarioBase() {
        return salario_base;
    }

    public int getAñosAntiguedad() {
        return años_antiguedad;
    }

    public double calcularSalario() {
        double salario = salario_base;
        if (años_antiguedad > 5) {
            salario += salario_base * 0.05; 
        }
        return salario;
    }

}
