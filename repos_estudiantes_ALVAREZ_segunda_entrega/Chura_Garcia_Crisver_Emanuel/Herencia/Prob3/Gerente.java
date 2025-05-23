//a) Implementa las clases con sus constructores, getters y setters.
public class Gerente extends Empleado {
    private String departamento;
    private float bono_gerencial;

    public Gerente(String nombre, String apellido, float salario_base, int años_antiguedad, String departamento,
            float bono_gerencial) {
        super(nombre, apellido, salario_base, años_antiguedad);
        this.departamento = departamento;
        this.bono_gerencial = bono_gerencial;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getBono_gerencial() {
        return bono_gerencial;
    }

    public void setBono_gerencial(float bono_gerencial) {
        this.bono_gerencial = bono_gerencial;
    }

    @Override
    public float calcular_salario() {
        return super.calcular_salario() + bono_gerencial;
    }
}