package PERSISTENCIA_DE_OBJETOS.EJERCICIO_1;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");

        archivo.guardarEmpleado(new Empleado("Luis", 30, 3500));
        archivo.guardarEmpleado(new Empleado("Ana", 28, 4200));
        archivo.guardarEmpleado(new Empleado("Carlos", 35, 5000));

        Empleado emp = archivo.buscaEmpleado("Ana");
        if (emp != null) {
            System.out.println("Empleado encontrado: " + emp);
        }

        Empleado mayor = archivo.mayorSalario(4000);
        if (mayor != null) {
            System.out.println("Empleado con salario mayor a 4000: " + mayor);
        }
    }
}
