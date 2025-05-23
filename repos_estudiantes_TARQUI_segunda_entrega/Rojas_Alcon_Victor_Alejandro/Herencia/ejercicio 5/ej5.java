class Empleado {
    String nombre, apellido;
    double salarioBase;
    int aniosAntiguedad;

    Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * aniosAntiguedad);
    }

    void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - Salario: Bs" + calcularSalario());
    }
}

class Gerente extends Empleado {
    String departamento;
    double bonoGerencial;

    Gerente(String nombre, String apellido, double salarioBase, int aniosAntiguedad, String departamento, double bonoGerencial) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.departamento = departamento;
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }

    @Override
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: " + departamento + ", Bono Gerencial: Bs" + bonoGerencial);
    }
}

class Desarrollador extends Empleado {
    String lenguajeProgramacion;
    int horasExtras;

    Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad, String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, aniosAntiguedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    @Override
    double calcularSalario() {
        return super.calcularSalario() + (horasExtras * 10);
    }

    @Override
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Lenguaje: " + lenguajeProgramacion + ", Horas Extras: " + horasExtras);
    }
}

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", "Gonzalez", 5000, 10, "Finanzas", 1000);
        Desarrollador desarrollador = new Desarrollador("Luis", "Ramirez", 3000, 5, "Java", 20);

        System.out.println("Información del Gerente:");
        gerente.mostrarInfo();

        System.out.println("\nInformación del Desarrollador:");
        desarrollador.mostrarInfo();
    }
}
