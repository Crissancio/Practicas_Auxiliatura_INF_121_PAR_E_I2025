public class Empleado {
    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected int añosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int añosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosAntiguedad = añosAntiguedad;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * añosAntiguedad);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Salario total: " + calcularSalario());
    }

    // Getters y setters
    public String getNombre() {
        return nombre; 
    }
    public String getApellido() { 
        return apellido; 
    }
    public double getSalarioBase() { 
        return salarioBase; 
    }
    public int getAñosAntiguedad() { 
        return añosAntiguedad; 
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    public void setApellido(String apellido) { 
        this.apellido = apellido; 
    }
    public void setSalarioBase(double salario) { 
        this.salarioBase = salario; 
    }
    public void setAñosAntiguedad(int años) { 
        this.añosAntiguedad = años; }
}
