public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras; 
    
    public Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                         String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, aniosAntiguedad); 
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    @Override
    public double calcularSalario() {
        final double MONTO_POR_HORA_EXTRA = 20.0;
        double bonoHorasExtras = horasExtras * MONTO_POR_HORA_EXTRA;
        return super.calcularSalario() + bonoHorasExtras;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Lenguaje de Programación: " + lenguajeProgramacion);
        System.out.println("Horas Extras: " + horasExtras);
    }
}
