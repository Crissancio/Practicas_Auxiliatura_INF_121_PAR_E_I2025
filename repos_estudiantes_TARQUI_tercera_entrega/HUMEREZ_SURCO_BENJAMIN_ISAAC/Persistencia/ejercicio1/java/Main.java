package Persistencia.ejercicio1.java;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("Empleados2025");

        archivo.guardarEmpleado(new Empleado("Ana", 25, 3000));
        archivo.guardarEmpleado(new Empleado("Luis", 30, 4500));
        archivo.guardarEmpleado(new Empleado("Pedro", 28, 3200));

        System.out.println("Buscar Luis: " + archivo.buscaEmpleado("Luis"));
        System.out.println("Mayor salario que 3100: " + archivo.mayorSalario(3100));
    }
}
