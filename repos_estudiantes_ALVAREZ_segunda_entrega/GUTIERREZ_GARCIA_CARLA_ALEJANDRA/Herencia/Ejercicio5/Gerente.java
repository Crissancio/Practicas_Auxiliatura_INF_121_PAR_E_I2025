public class Gerente extends Empleado {
    private String departamento;
    private float bono_gerencial;

    public Gerente(String n, String ap, float sb, int ant, String dep, float bonoG) {
        super(n, ap, sb, ant);
        this.departamento = dep;
        this.bono_gerencial = bonoG;

    }

    @Override
    public float calcular_salario() {
        return super.calcular_salario() + this.bono_gerencial;
    }

    public void mostrarSiBonoMayorA(double monto) {
        if (this.bono_gerencial > monto) {
            System.out.println(this.getNombre() + " " + this.getApellido() + " - Bono: " + this.getBono_gerencial());
        }
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String dep) {
        this.departamento = dep;
    }

    public float getBono_gerencial() {
        return bono_gerencial;
    }

    public void setBono_gerencial(float bonoG) {
        this.bono_gerencial = bonoG;
    }

}