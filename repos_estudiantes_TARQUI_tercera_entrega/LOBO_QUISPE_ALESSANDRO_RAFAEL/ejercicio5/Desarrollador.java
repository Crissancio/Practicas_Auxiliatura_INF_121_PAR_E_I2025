
package ejercicio5;


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
        return super.calcularSalario() + (horasExtras * 10); 
    }

    public int getHorasExtras() { return horasExtras; }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Lenguaje: " + lenguajeProgramacion + ", Horas Extras: " + horasExtras +
                           ", Salario Total: " + calcularSalario());
    }
}
