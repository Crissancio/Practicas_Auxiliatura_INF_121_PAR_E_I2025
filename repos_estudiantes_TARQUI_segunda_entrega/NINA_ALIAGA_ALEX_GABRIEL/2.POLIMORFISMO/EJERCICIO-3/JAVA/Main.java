public class Main {
    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero("Juan", 2000, 10, 15.5f);
        Mesero mesero1 = new Mesero("Pedro", 1500, 5, 12.0f, 200.0f);
        Mesero mesero2 = new Mesero("Luis", 1600, 8, 13.0f, 250.0f);
        Administrativo admin1 = new Administrativo("Ana", 1800, "Gerente");
        Administrativo admin2 = new Administrativo("Maria", 1900, "Recepcionista");

        Empleado[] empleados = {cocinero, mesero1, mesero2, admin1, admin2};

        for (Empleado empleado : empleados) {
            System.out.println("Sueldo Total de " + empleado.nombre + ": " + empleado.sueldoTotal());
        }

        System.out.println("\nEmpleados con sueldo mensual de 1800:");
        Administrativo.mostrarEmpleadosConSueldo(empleados, 1800);
    }
}
