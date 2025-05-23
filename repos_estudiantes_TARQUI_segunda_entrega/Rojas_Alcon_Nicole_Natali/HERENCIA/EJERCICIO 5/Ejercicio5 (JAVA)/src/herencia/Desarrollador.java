package herencia;

public class Desarrollador extends Empleado {
    public String lenguajeProgramacion;
    public int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int añosAntiguedad, String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        double pagoExtra = horasExtras * 40;
        return super.calcularSalario() + pagoExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}
