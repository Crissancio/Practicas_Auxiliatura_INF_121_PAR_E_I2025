public class Empleado {
    private String nombre;
    private String apellido;
    private double salario_base;
    private int anios_antiguedad;
    
    public Empleado(String nombre, String apellido, double salario_base, int anios_antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario_base = salario_base;
        this.anios_antiguedad = anios_antiguedad;
    }
    
    public double calcular_salario() {
        return salario_base + (salario_base * 0.05 * anios_antiguedad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public int getAnios_antiguedad() {
        return anios_antiguedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public void setAnios_antiguedad(int anios_antiguedad) {
        this.anios_antiguedad = anios_antiguedad;
    }
}
