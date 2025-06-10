package ejercicio1;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");

        archivo.guardarEmpleado(new Empleado("Juan Pérez", 35, 4500));
        archivo.guardarEmpleado(new Empleado("María Gómez", 28, 5200));
        archivo.guardarEmpleado(new Empleado("Carlos Ruiz", 42, 3800));

        Empleado emp = archivo.buscaEmpleado("María Gómez");
        if (emp != null) {
            System.out.println("Empleado encontrado: " + emp);
        } else {
            System.out.println("Empleado no encontrado");
        }

        Empleado emp_mayor = archivo.mayorSalario(4000);
        if (emp_mayor != null) {
            System.out.println("Empleado con salario mayor a 4000: " + emp_mayor);
        } else {
            System.out.println("No hay empleados con salario mayor a 4000");
        }
    }
}