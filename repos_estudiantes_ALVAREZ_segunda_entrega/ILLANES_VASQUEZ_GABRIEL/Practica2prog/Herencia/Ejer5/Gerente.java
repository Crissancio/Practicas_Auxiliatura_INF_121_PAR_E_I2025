
package Ejercicio5;

/**
 e (hereda de Empleado)< departamento, bono_gerencial>
Métodos: calcular_salario() (debe sumar el bono gerencial al
salario calculado en la clase base)
 */
public class Gerente extends Empleado{
    private String departamento;
    private Double bono_general;

    public Gerente(String departamento, Double bono_general, String nombre, String apellido, int salario_base, int años_antiguedsd) {
        super(nombre, apellido, salario_base, años_antiguedsd);
        this.departamento = departamento;
        this.bono_general = bono_general;
    }
    @Override
    public double calcular_salario(){
        double c = bono_general + super.calcular_salario();
        return c;
    }
    public void mostrarS(){
        double c = calcular_salario();
        System.out.println("el salario del gerente es; " +c);
    }
    
    public void mostrarBono(){
        if(bono_general>1000){
            System.out.println("el bono es mayor a 1000  del empleado" +nombre);
        }
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getBono_general() {
        return bono_general;
    }

    public void setBono_general(Double bono_general) {
        this.bono_general = bono_general;
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
