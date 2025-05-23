
package appempleados;

public class Desarrollador extends Empleado {
    private String lenguaje;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int añosAntiguedad,
                         String lenguaje, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntiguedad);
        this.lenguaje = lenguaje;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasExtras * 100);
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}

