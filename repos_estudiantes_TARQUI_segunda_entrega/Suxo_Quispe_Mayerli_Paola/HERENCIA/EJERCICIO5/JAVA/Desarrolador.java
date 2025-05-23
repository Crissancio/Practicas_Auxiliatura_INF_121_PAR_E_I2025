public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                         String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        double montoHorasExtras = horasExtras * 20; // Suponemos 20 por hora extra
        return super.calcularSalario() + montoHorasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void mostrar() {
        System.out.println("Desarrollador: " + nombre + " " + apellido + ", Lenguaje: " + lenguajeProgramacion +
                ", Salario Total: " + calcularSalario());
    }
}
