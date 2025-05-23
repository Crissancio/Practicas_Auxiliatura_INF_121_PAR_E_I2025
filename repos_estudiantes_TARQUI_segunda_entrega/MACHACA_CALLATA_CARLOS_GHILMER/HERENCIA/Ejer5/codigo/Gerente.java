package HERENCIA.Ejer5.codigo;

public class Gerente extends Empleado {
    private String departamento;
    private double bonus;

    public Gerente(String nombre, String apellido, double salario_base, int años_antiguedad, String departamento, double bonus) {
        super(nombre, apellido, salario_base, años_antiguedad);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public double calcularSalario() {
        double salario = super.calcularSalario();
        if (getAñosAntiguedad() > 5) {
            salario += getSalarioBase()* 0.10; 
        }
        return salario + bonus; 
    }

    public void mostrarBono() {
        if (getBonus() > 1000) {
            System.out.println("Gerente " + getNombre() + " " + getApellido() + " tiene un bono de : " + getBonus());
        }
        else {
            System.out.println("Gerente " + getNombre() + " " + getApellido() + " no tiene bono");
        }
    }

}
