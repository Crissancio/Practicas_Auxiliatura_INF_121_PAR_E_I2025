public class Gerente extends Empleado{
    private String departamento;
    private double bono_gerencial;
    
    public Gerente(String nombre, String apellido, double salario_base, int anios_antiguedad, String departamento, double bono_gerencial) {
        super(nombre, apellido, salario_base, anios_antiguedad);
        this.departamento = departamento;
        this.bono_gerencial = bono_gerencial;
    }
    
    @Override
    public double calcular_salario() {
        return super.calcular_salario() + bono_gerencial;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getBono_gerencial() {
        return bono_gerencial;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setBono_gerencial(double bono_gerencial) {
        this.bono_gerencial = bono_gerencial;
    }   
}
