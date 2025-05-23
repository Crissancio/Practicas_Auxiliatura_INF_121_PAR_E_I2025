
public class Empleado {
    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected int aniosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double calcularSalario() {
        
        double bonoAntiguedad = salarioBase * 0.05 * aniosAntiguedad;
        return salarioBase + bonoAntiguedad;
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Salario Base: $" + String.format("%.2f", salarioBase));
        System.out.println("Años de Antigüedad: " + aniosAntiguedad);
    }
}
