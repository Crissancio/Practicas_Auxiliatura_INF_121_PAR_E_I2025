package Herencia;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salario_base;
    private int años_antiguedad;

    public Empleado(String nombre, String apellido, double salario_base, int años_antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario_base = salario_base;
        this.años_antiguedad = años_antiguedad;
    }

    public double calcular_salario() {
        return salario_base + (salario_base * 0.05 * años_antiguedad);
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

    public double getSalario_base() { 
    	return salario_base; 
    	}
    public void setSalario_base(double salario_base) {
    	this.salario_base = salario_base; 
    	}

    public int getAños_antiguedad() {
    	return años_antiguedad; 
    	}
    public void setAños_antiguedad(int años_antiguedad) { 
    	this.años_antiguedad = años_antiguedad; 
    	}
}
