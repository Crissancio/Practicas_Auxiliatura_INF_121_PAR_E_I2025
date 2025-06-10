package Herencia.Ej5;

public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int añosAntiguedad, String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        double pagoExtra = horasExtras * 20; // 20 por hora extra
        return super.calcularSalario() + pagoExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}
