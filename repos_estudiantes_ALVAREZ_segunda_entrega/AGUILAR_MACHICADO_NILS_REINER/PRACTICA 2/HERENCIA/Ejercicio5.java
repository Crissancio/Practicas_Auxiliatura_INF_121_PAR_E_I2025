class Empleado {
    protected String nombre, apellido;
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

    public String toString() {
        return nombre + " " + apellido + " - Salario: " + calcularSalario();
    }
}

class Gerente extends Empleado {
    private String departamento;
    private double bonoGerencial;

    public Gerente(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                   String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }
}

class Desarrollador extends Empleado {
    private String lenguaje;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                         String lenguaje, int horasExtras) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.lenguaje = lenguaje;
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (50 * horasExtras);
    }
}

class TestEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[] {
            new Gerente("Luis", "Soto", 4000, 10, "Ventas", 1200),
            new Gerente("Clara", "Rios", 4200, 8, "TI", 800),
            new Desarrollador("Marco", "Gomez", 3000, 6, "Python", 12),
            new Desarrollador("Eva", "Lopez", 2900, 5, "Java", 8)
        };

        System.out.println("--- Salarios calculados ---");
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        System.out.println("\n--- Gerentes con bono > 1000 ---");
        for (Empleado e : empleados) {
            if (e instanceof Gerente g && g.getBonoGerencial() > 1000) {
                System.out.println(g);
            }
        }

        System.out.println("\n--- Desarrolladores con más de 10 horas extras ---");
        for (Empleado e : empleados) {
            if (e instanceof Desarrollador d && d.getHorasExtras() > 10) {
                System.out.println(d);
            }
        }
    }
}
