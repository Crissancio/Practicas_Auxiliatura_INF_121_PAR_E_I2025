package Persistencia;

public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado emp1 = new Empleado("Juan Pérez", 2500.50);
        Empleado emp2 = new Empleado("María Gómez", 3200.75);
        Empleado emp3 = new Empleado("Carlos Ruiz", 1800.25);

        // Guardar empleados
        if (Persistencia.guardarEmpleado(emp1)) {
            System.out.println("Empleado guardado: " + emp1.getNombre());
        }
        
        if (Persistencia.guardarEmpleado(emp2)) {
            System.out.println("Empleado guardado: " + emp2.getNombre());
        }
        
        if (Persistencia.guardarEmpleado(emp3)) {
            System.out.println("Empleado guardado: " + emp3.getNombre());
        }

        // Buscar empleado
        Empleado encontrado = Persistencia.buscarEmpleado("María Gómez");
        if (encontrado != null) {
            System.out.println("Empleado encontrado: " + encontrado.getNombre() +
                             " - Sueldo: " + encontrado.getSueldo());
        } else {
            System.out.println("No se encontró el empleado");
        }

        // Buscar mayor salario
        Empleado mayor = Persistencia.mayorSalario(2000.0);
        if (mayor != null) {
            System.out.println("Empleado con mayor salario: " + mayor.getNombre() +
                             " - Sueldo: " + mayor.getSueldo());
        } else {
            System.out.println("No se encontraron empleados con salario mayor a 2000.0");
        }
    }
}
