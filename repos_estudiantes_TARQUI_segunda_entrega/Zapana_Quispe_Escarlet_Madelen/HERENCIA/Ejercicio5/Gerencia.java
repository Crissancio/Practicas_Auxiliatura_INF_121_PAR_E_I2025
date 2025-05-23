public class Gerencia extends Empleado{
    private String Departamento;
    private double bono_gerencial;
    public Gerencia(String nombre,String apellido, double salario_base,int años_antiguedad,String departamento,double bono_gerencial){
        super(nombre,apellido,salario_base,años_antiguedad);
        this.Departamento=departamento;
        this.bono_gerencial=bono_gerencial;
    }
    public double calcularSalario(){
        return super.calcularSalario()+this.bono_gerencial;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public double getBono_gerencial() {
        return bono_gerencial;
    }

    public void setBono_gerencial(double bono_gerencial) {
        this.bono_gerencial = bono_gerencial;
    }
    
}
