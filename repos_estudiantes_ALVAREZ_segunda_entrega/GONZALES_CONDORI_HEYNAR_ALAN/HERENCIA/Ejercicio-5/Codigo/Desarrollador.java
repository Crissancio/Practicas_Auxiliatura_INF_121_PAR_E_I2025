
package Ejercicio05;

public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;
    private final double pagoPorHoraExtra = 20.0;

    public Desarrollador(String nombre, String apellido, double salarioBase, int añosAntiguedad,
                         String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcular_salario() {
        return super.calcular_salario() + (horasExtras * pagoPorHoraExtra);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Lenguaje de programación: " + lenguajeProgramacion);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Salario total: $" + calcular_salario());
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}

