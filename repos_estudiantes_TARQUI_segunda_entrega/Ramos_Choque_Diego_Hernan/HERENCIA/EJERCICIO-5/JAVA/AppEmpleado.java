package Herencia;

public class AppEmpleado {

    static class Empleado {
        String nombre;
        String apellido;
        double salarioBase;
        int aniosAntiguedad;

        public Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.salarioBase = salarioBase;
            this.aniosAntiguedad = aniosAntiguedad;
        }

        public double calcularSalario() {
            double bono = salarioBase * 0.05 * aniosAntiguedad;
            return salarioBase + bono;
        }

        public void mostrar() {
            System.out.println(nombre + " " + apellido + " - Salario: " + calcularSalario());
        }
    }

    static class Gerente extends Empleado {
        String departamento;
        double bonoGerencial;

        public Gerente(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                       String departamento, double bonoGerencial) {
            super(nombre, apellido, salarioBase, aniosAntiguedad);
            this.departamento = departamento;
            this.bonoGerencial = bonoGerencial;
        }

        @Override
        public double calcularSalario() {
            return super.calcularSalario() + bonoGerencial;
        }

        @Override
        public void mostrar() {
            super.mostrar();
            System.out.println("Departamento: " + departamento + " - Bono Gerencial: " + bonoGerencial);
        }
    }

    static class Desarrollador extends Empleado {
        String lenguajeProgramacion;
        int horasExtras;

        public Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad,
                             String lenguajeProgramacion, int horasExtras) {
            super(nombre, apellido, salarioBase, aniosAntiguedad);
            this.lenguajeProgramacion = lenguajeProgramacion;
            this.horasExtras = horasExtras;
        }

        @Override
        public double calcularSalario() {
            double pagoExtra = horasExtras * 50; // cada hora extra vale 50
            return super.calcularSalario() + pagoExtra;
        }

        @Override
        public void mostrar() {
            super.mostrar();
            System.out.println("Lenguaje: " + lenguajeProgramacion + " - Horas Extras: " + horasExtras);
        }
    }

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Laura", "Gomez", 3000, 5, "Ventas", 1200);
        Gerente g2 = new Gerente("Carlos", "Lopez", 2800, 3, "Recursos Humanos", 900);
        Desarrollador d1 = new Desarrollador("Ana", "Perez", 2000, 2, "Java", 12);
        Desarrollador d2 = new Desarrollador("Juan", "Torrez", 2200, 4, "Python", 8);

        System.out.println("\n--- Mostrar salarios ---");
        g1.mostrar();
        System.out.println();
        g2.mostrar();
        System.out.println();
        d1.mostrar();
        System.out.println();
        d2.mostrar();

        System.out.println("\n--- Gerentes con bono mayor a 1000 ---");
        if (g1.bonoGerencial > 1000) g1.mostrar();
        if (g2.bonoGerencial > 1000) g2.mostrar();

        System.out.println("\n--- Desarrolladores con más de 10 horas extras ---");
        if (d1.horasExtras > 10) d1.mostrar();
        if (d2.horasExtras > 10) d2.mostrar();
    }
}
