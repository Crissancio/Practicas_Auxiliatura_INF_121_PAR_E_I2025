package HERENCIA.EJER_5;
public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;
    public Desarrollador(String nombre, String apellido, double salarioBase, 
                         int añosAntiguedad, String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }
    @Override
    public double calcularSalario() {
        double pagoHorasExtras = horasExtras * (getSalarioBase() / 160); // 160 horas mensuales
        return super.calcularSalario() + pagoHorasExtras;
    }
    public int getHorasExtras() {
        return horasExtras;
    }
}