class Empleado {
    protected String nombre;
    protected String apellido;
    protected float salario_base;
    protected int años_antigüedad;

    public Empleado(String nombre, String apellido, float salario_base, int años_antigüedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario_base = salario_base;
        this.años_antigüedad = años_antigüedad;
    }

    public float calcular_salario() {
        return salario_base + (salario_base * 0.05f * años_antigüedad);
    }
}

class Gerente extends Empleado {
    private String departamento;
    private float bono_gerencial;

    public Gerente(String nombre, String apellido, float salario_base, 
                   int años_antigüedad, String departamento, float bono_gerencial) {
        super(nombre, apellido, salario_base, años_antigüedad);
        this.departamento = departamento;
        this.bono_gerencial = bono_gerencial;
    }

    @Override
    public float calcular_salario() {
        return super.calcular_salario() + bono_gerencial;
    }
}

class Desarrollador extends Empleado {
    private String lenguaje_programación;
    private int horas_extras;

    public Desarrollador(String nombre, String apellido, float salario_base, 
                         int años_antigüedad, String lenguaje_programación, int horas_extras) {
        super(nombre, apellido, salario_base, años_antigüedad);
        this.lenguaje_programación = lenguaje_programación;
        this.horas_extras = horas_extras;
    }

    @Override
    public float calcular_salario() {
        return super.calcular_salario() + (horas_extras * 50); // $50 por hora extra
    }
}

public class MainEmpleados {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Carlos", "Eltopo", 8000, 5, "TI", 1500);
        Desarrollador dev1 = new Desarrollador("Rogelio", "quehabla", 5000, 3, "Java", 12);

        System.out.println("Salario del gerente: " + gerente1.calcular_salario());
        System.out.println("Salario del desarrollador: " + dev1.calcular_salario());
    }
}