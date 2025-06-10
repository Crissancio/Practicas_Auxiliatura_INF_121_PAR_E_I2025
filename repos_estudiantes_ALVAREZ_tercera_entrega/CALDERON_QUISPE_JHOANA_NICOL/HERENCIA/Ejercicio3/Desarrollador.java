public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int añosAntiguedad,
            String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setLenguajeProgramacion(String lenguaje) {
        this.lenguajeProgramacion = lenguaje;
    }

    public void setHorasExtras(int horas) {
        this.horasExtras = horas;
    }

    @Override
    public double calcularSalario() {
        double montoPorHora = 50;
        return super.calcularSalario() + (horasExtras * montoPorHora);
    }
}
