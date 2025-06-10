// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//3. Un restaurante organiza a su personal mediante las siguientes clases:
//
//a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
//b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
//sumándole las horas extra, considerando el sueldo por hora y la propina
//en caso de los meseros.
//c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
//SueldoMes igual a X.

public class Empleados {
    private String nombre;
    private double sueldoMes;

    public Empleados(String nombre, double sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public double sueldoTotal() {
        return sueldoMes;
    }

    public double getSueldoMes() {
        return sueldoMes;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Sueldo Mensual: " + sueldoMes);
    }

    public static class Cocinero extends Empleados {
        private double horasExtra;
        private double sueldoHora;

        public Cocinero(String nombre, double sueldoMes, double horasExtra, double sueldoHora) {
            super(nombre, sueldoMes);
            this.horasExtra = horasExtra;
            this.sueldoHora = sueldoHora;
        }

        public double sueldoTotal() {
            return getSueldoMes() + (horasExtra * sueldoHora);
        }
    }

    public static class Mesero extends Empleados {
        private double propina;

        public Mesero(String nombre, double sueldoMes, double propina) {
            super(nombre, sueldoMes);
            this.propina = propina;
        }

        public double sueldoTotal() {
            return getSueldoMes() + propina;
        }
    }

    public static class Administrativo extends Empleados {
        private String cargo;

        public Administrativo(String nombre, double sueldoMes, String cargo) {
            super(nombre, sueldoMes);
            this.cargo = cargo;
        }

        public double sueldoTotal() {
            return getSueldoMes();
        }
    }

    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero("Gafi", 1500, 10, 20);
        Mesero mesero1 = new Mesero("Ana", 1200, 150);
        Mesero mesero2 = new Mesero("Pedro", 1200, 100);
        Administrativo admin1 = new Administrativo("Alam", 2000, "Gerente");
        Administrativo admin2 = new Administrativo("Xd", 1800, "Supervisor");

        System.out.println("Sueldos Totales:");
        System.out.println("Cocinero: " + cocinero.sueldoTotal());
        System.out.println("Mesero 1: " + mesero1.sueldoTotal());
        System.out.println("Mesero 2: " + mesero2.sueldoTotal());
        System.out.println("Administrativo 1: " + admin1.sueldoTotal());
        System.out.println("Administrativo 2: " + admin2.sueldoTotal());

        double x = 1200;
        System.out.println("Empleados con SueldoMes igual a " + x + ":");
        if (cocinero.getSueldoMes() == x) cocinero.mostrar();
        if (mesero1.getSueldoMes() == x) mesero1.mostrar();
        if (mesero2.getSueldoMes() == x) mesero2.mostrar();
        if (admin1.getSueldoMes() == x) admin1.mostrar();
        if (admin2.getSueldoMes() == x) admin2.mostrar();
    }
}
