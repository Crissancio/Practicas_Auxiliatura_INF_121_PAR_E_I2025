// a)
public class Gerente extends Empleado {
    private String departamento;
    private double bono_gerencial;
    public Gerente(String nombre, String apellido, double salario_base, int años_antigüedad,String d, double b) {
        super(nombre, apellido, salario_base, años_antigüedad);
        this.departamento = d;
        this.bono_gerencial = b;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getBono_Gerencial() { 
        return bono_gerencial;
    }
    public void setBonoGerencial(double bono_gerencial) { 
        this.bono_gerencial = bono_gerencial;
    }
    @Override
    public double calcular_salario() {
        return super.calcular_salario() + bono_gerencial;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("departamento: " + departamento);
        System.out.println("bono gerencial: " + bono_gerencial);
        System.out.println("salario total: " + calcular_salario());
          }
    public static void mostrarGerentesBonoMayor1000(Gerente[] x, int c) {
        System.out.println("\n Gerentes con bono gerencial mayor a 1000: ");
        for (int i = 0; i < c; i++) {
            if (x[i].getBono_Gerencial() > 1000) {
                x[i].mostrar();
            }
        }
    }
}