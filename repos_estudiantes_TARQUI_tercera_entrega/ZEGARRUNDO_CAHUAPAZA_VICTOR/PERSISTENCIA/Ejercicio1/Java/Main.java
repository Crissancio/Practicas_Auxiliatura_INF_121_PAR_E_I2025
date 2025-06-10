package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");

        archivo.guardarEmpleado(new Empleado("Luis", 30, 2500));
        archivo.guardarEmpleado(new Empleado("Ana", 28, 3200));

        Empleado encontrado = archivo.buscaEmpleado("Ana");
        if (encontrado != null) {
            System.out.println("Empleado encontrado: " + encontrado);
        } else {
            System.out.println("Empleado no encontrado.");
        }

        Empleado mayor = archivo.mayorSalario(2800);
        if (mayor != null) {
            System.out.println("Empleado con salario mayor a 2800: " + mayor);
        } else {
            System.out.println("No se encontró empleado con ese salario.");
        }
    }
}