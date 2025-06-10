package ej1persistencia;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.json");

        archivo.guardarEmpleado(new Empleado("Carlos", 30, 1500));
        archivo.guardarEmpleado(new Empleado("Ana", 28, 2500));
        archivo.guardarEmpleado(new Empleado("Luis", 35, 4000));

        Empleado emp = archivo.buscaEmpleado("Ana");
        System.out.println("Empleado encontrado: " + (emp != null ? emp : "Empleado no encontrado."));

        emp = archivo.mayorSalario(3000);
        System.out.println("Empleado con salario mayor a 3000: " + (emp != null ? emp : "No hay empleados con salario mayor al ingresado."));
    }
}
