// a)
public class Empleado {
    private String nombre;
    private String apellido;
    private double salario_base;
    private int años_antigüedad;
    public Empleado(String n, String a, double s, int b) {
        this.nombre = n;
        this.apellido = a;
        this.salario_base = s;
        this.años_antigüedad = b;
    }
    public String getNombre() { 
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public String getApellido() { 
        return apellido; 
        
    }
    public void setApellido(String apellido) {
        this.apellido = apellido; 
            
    }
    public double getSalarioBase() {
        return salario_base;
}
    public void setSalario_Base(double salario_base) { 
        this.salario_base = salario_base; 
}
    public int getAñosAntigüedad() {
        return años_antigüedad;
    }
    public void setAñosAntigüedad(int años_antigüedad) { 
        this.años_antigüedad = años_antigüedad;
    }
    public double calcular_salario() {
        double bonoA = salario_base * (0.05 * años_antigüedad);
        return salario_base + bonoA;
    }
    public void mostrar() {
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("salario base: " + salario_base);
        System.out.println("años de antigüedad: " + años_antigüedad);
    }
}