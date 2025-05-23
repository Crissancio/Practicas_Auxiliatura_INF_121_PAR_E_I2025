import java.util.ArrayList;

public class EmpleadosApp {

    static class Empleado {
        private String nombre;
        private String apellido;
        private double salarioBase;
        private int aniosAntiguedad;

        public Empleado(String nombre, String apellido, double salarioBase, int aniosAntiguedad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.salarioBase = salarioBase;
            this.aniosAntiguedad = aniosAntiguedad;
        }

        public String getNombre() { return nombre; }
        public String getApellido() { return apellido; }
        public double getSalarioBase() { return salarioBase; }
        public int getAniosAntiguedad() { return aniosAntiguedad; }

        public void setNombre(String nombre) { this.nombre = nombre; }
        public void setApellido(String apellido) { this.apellido = apellido; }
        public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
        public void setAniosAntiguedad(int aniosAntiguedad) { this.aniosAntiguedad = aniosAntiguedad; }

        public double calcularSalario() {
            return salarioBase + (salarioBase * 0.05 * aniosAntiguedad);
        }
    }

   
    static class Gerente extends Empleado {
        private String departamento;
        private double bonoGerencial;

        public Gerente(String nombre, String apellido, double salarioBase, int aniosAntiguedad, String departamento, double bonoGerencial) {
            super(nombre, apellido, salarioBase, aniosAntiguedad);
            this.departamento = departamento;
            this.bonoGerencial = bonoGerencial;
        }

        public String getDepartamento() { return departamento; }
        public double getBonoGerencial() { return bonoGerencial; }

        public void setDepartamento(String departamento) { this.departamento = departamento; }
        public void setBonoGerencial(double bonoGerencial) { this.bonoGerencial = bonoGerencial; }

        @Override
        public double calcularSalario() {
            return super.calcularSalario() + bonoGerencial;
        }

        public void mostrar() {
            System.out.println(" Gerente: " + getNombre() + " " + getApellido() + " | Salario: bs" + calcularSalario());
        }
    }

    
    static class Desarrollador extends Empleado {
        private String lenguajeProgramacion;
        private int horasExtras;

        public Desarrollador(String nombre, String apellido, double salarioBase, int aniosAntiguedad, String lenguajeProgramacion, int horasExtras) {
            super(nombre, apellido, salarioBase, aniosAntiguedad);
            this.lenguajeProgramacion = lenguajeProgramacion;
            this.horasExtras = horasExtras;
        }

        public String getLenguajeProgramacion() { return lenguajeProgramacion; }
        public int getHorasExtras() { return horasExtras; }

        public void setLenguajeProgramacion(String lenguajeProgramacion) { this.lenguajeProgramacion = lenguajeProgramacion; }
        public void setHorasExtras(int horasExtras) { this.horasExtras = horasExtras; }

        @Override
        public double calcularSalario() {
            double pagoHorasExtras = horasExtras * 20; 
            return super.calcularSalario() + pagoHorasExtras;
        }

        public void mostrar() {
            System.out.println(" Desarrollador: " + getNombre() + " " + getApellido() + " | Salario: $" + calcularSalario());
        }
    }

    public static void main(String[] args) {
        System.out.println("Noemí Chino Blanco");

        Gerente g1 = new Gerente("noemi", "chino", 3000, 10, "Ventas", 1200);
        Gerente g2 = new Gerente("julio", "quispe", 2800, 8, "Marketing", 800);

        Desarrollador d1 = new Desarrollador("Carlos", "Lopez", 2500, 5, "Java", 12);
        Desarrollador d2 = new Desarrollador("Sara", "Quispe", 2600, 4, "Python", 8);

        
        g1.mostrar();
        g2.mostrar();
        d1.mostrar();
        d2.mostrar();

        System.out.println("\n Gerentes con bono gerencial mayor a 1000:");
        ArrayList<Gerente> gerentes = new ArrayList<>();
        gerentes.add(g1);
        gerentes.add(g2);
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                g.mostrar();
            }
        }

        System.out.println("\n Desarrolladores con más de 10 horas extras:");
        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();
        desarrolladores.add(d1);
        desarrolladores.add(d2);
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                d.mostrar();
            }
        }
    }
}
