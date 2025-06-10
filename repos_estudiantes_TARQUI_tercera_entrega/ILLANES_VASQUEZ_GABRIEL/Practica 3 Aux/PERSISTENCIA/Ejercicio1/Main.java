package Ejercicio1;

public class Main {
    public static void main(String[] args) throws Exception {
        ArchivoEmpleado archivo = new ArchivoEmpleado("ArchivoEmpleado");

        Empleado emp1 = new Empleado("Gabo", 28, 35000.0f);
        Empleado emp2 = new Empleado("XD", 32, 4700.5f);
        Empleado emp3 = new Empleado("Nosexd", 24, 2900.0f);

        archivo.guardarEmpleado(emp1);
        archivo.guardarEmpleado(emp2);
        archivo.guardarEmpleado(emp3);

        Empleado buscado = archivo.buscaEmpleado("Gabo");
        System.out.println("Empleado buscado: " + buscado);

        Empleado mayorSalario = archivo.mayorSalario(3000);
        System.out.println("Empleado con salario mayor a 3000: " + mayorSalario);
    }
}
