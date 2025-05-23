public class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                   String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, aniosAntiguedad); 
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }
    public String getDepartamento() {
        return departamento;
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setBonoGerencial(double bonoGerencial) {
        this.bonoGerencial = bonoGerencial;
    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Departamento: " + departamento);
        System.out.println("Bono Gerencial: $" + String.format("%.2f", bonoGerencial));
    }
}
