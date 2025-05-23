
package appempleados;

public class AppEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Gerente("Laura", "Mendoza", 5000, 5, "Finanzas", 1200);
        empleados[1] = new Gerente("Carlos", "Ruiz", 6000, 10, "Ventas", 900);
        empleados[2] = new Desarrollador("Ana", "Lopez", 4000, 3, "Python", 12);
        empleados[3] = new Desarrollador("Luis", "Rojas", 3500, 1, "Java", 8);

        System.out.println("\n--- Salarios calculados ---");
        for (Empleado emp : empleados) {
            System.out.println(emp.mostrarInfo() + " - Salario total: " + emp.calcularSalario());
        }

        System.out.println("\n--- Gerentes con bono mayor a 1000 ---");
        for (Empleado emp : empleados) {
            if (emp instanceof Gerente) {
                Gerente g = (Gerente) emp;
                if (g.getBonoGerencial() > 1000) {
                    System.out.println(g.mostrarInfo());
                }
            }
        }

        System.out.println("\n--- Desarrolladores con mas de 10 horas extras ---");
        for (Empleado emp : empleados) {
            if (emp instanceof Desarrollador) {
                Desarrollador d = (Desarrollador) emp;
                if (d.getHorasExtras() > 10) {
                    System.out.println(d.mostrarInfo());
                }
            }
        }
    }
}

