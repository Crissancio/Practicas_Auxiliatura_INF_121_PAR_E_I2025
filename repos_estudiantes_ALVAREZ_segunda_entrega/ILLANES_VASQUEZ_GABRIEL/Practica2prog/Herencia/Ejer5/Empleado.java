
package Ejercicio5;

/**
 <nombre, apellido, salario_base, años_antigüedad
Métodos: calcular_salario() (retorna el salario base más un bono
del 5% por cada año de antigüedad)
 */
public class Empleado {
    protected String nombre, apellido;
    protected double salario_base;
    protected int años_antiguedsd;

    public Empleado(String nombre, String apellido, int salario_base, int años_antiguedsd) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario_base = salario_base;
        this.años_antiguedsd = años_antiguedsd;
    }
    
    public double calcular_salario(){
        double c = salario_base+(salario_base)*0.05;
        return c;
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

    public int getAños_antiguedsd() {
        return años_antiguedsd;
    }

    public void setAños_antiguedsd(int años_antiguedsd) {
        this.años_antiguedsd = años_antiguedsd;
    }
    
    
}

