package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");

        archivo.crearArchivo();

        archivo.guardarEmpleado(new Empleado("Ana", 28, 4200));
        archivo.guardarEmpleado(new Empleado("Luis", 35, 5500));
        archivo.guardarEmpleado(new Empleado("Rosa", 40, 3800));

        System.out.println("--- Buscar empleado por nombre: Luis ---");
        Empleado encontrado = archivo.buscaEmpleado("Luis");
        System.out.println(encontrado != null ? encontrado : "No encontrado");

        System.out.println("--- Buscar empleado con salario mayor a 4000 ---");
        Empleado mayor = archivo.mayorSalario(4000);
        System.out.println(mayor != null ? mayor : "Ninguno supera ese salario");
    }
}
