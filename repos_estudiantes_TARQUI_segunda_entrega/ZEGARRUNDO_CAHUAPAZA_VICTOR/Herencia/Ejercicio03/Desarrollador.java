package Herencia3;

public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, int salarioBase, int aniosAntiguedad, String lenguajeProgramacion, Object object) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = (int) object;
    }

    public int calcularSalario() {
        return super.calcularSalario() + (horasExtras * 50);
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Lenguaje: " + lenguajeProgramacion + ", Horas Extras: " + horasExtras);
    }
}


