import java.util.*;
class Empleado {
    protected String nombre;
    protected String apellido;
    protected double salarioBase;
    protected int aniosAntiguedad;

    public Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * aniosAntiguedad);
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " " + apellido +
                ", Salario Base: " + salarioBase +
                ", Años de Antigüedad: " + aniosAntiguedad +
                ", Salario Total: " + calcularSalario());
    }
}

class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int aniosAntiguedad, String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Departamento: " + departamento + ", Bono Gerencial: " + bonoGerencial);
    }
}

class Desarrollador extends Empleado {
    private String lenguajeProgramacion;
    private int horasExtras;
    private final double pagoPorHoraExtra = 50;

    public Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad, String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasExtras * pagoPorHoraExtra);
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Lenguaje: " + lenguajeProgramacion + ", Horas Extras: " + horasExtras);
    }
}
public class Area5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Gerente> gerentes = new ArrayList<>();
        List<Desarrollador> desarrolladores = new ArrayList<>();

        gerentes.add(new Gerente("Carlos", "Lopez", 5000, 10, "TI", 1500));
        gerentes.add(new Gerente("Lucia", "Quispe", 4800, 5, "Recursos Humanos", 900));

        desarrolladores.add(new Desarrollador("Marta", "Salazar", 4000, 3, "Java", 12));
        desarrolladores.add(new Desarrollador("Jorge", "Perez", 4200, 4, "Python", 8));

        System.out.println("Salarios de Gerentes:");
        for (Gerente g : gerentes) {
            g.mostrar();
            System.out.println();
        }

        System.out.println("Salarios de Desarrolladores:");
        for (Desarrollador d : desarrolladores) {
            d.mostrar();
            System.out.println();
        }

        System.out.println("Gerentes con bono mayor a 1000:");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                g.mostrar();
                System.out.println();
            }
        }

        System.out.println("Desarrolladores con más de 10 horas extras:");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                d.mostrar();
                System.out.println();
            }
        }
    }
    
}

