package Persistencia_de_Objetos.Ejercicio1.Java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "empleados_ejercicio1.txt";
        ArchivoEmpleado archivoEmpleado = new ArchivoEmpleado(nombreArchivo);

        archivoEmpleado.limpiarArchivo();

        System.out.println("\n--- Guardando Empleados ---");
        Empleado emp1 = new Empleado("Maria Celeste", 30, 55000.00f);
        Empleado emp2 = new Empleado("Carlos Johnson", 25, 48000.50f);
        Empleado emp3 = new Empleado("Abel Fernandez", 45, 72000.75f);
        Empleado emp4 = new Empleado("Santiago Barrancos", 32, 60000.00f);

        archivoEmpleado.guardarEmpleado(emp1);
        archivoEmpleado.guardarEmpleado(emp2);
        archivoEmpleado.guardarEmpleado(emp3);
        archivoEmpleado.guardarEmpleado(emp4);

        System.out.println("\n--- Buscando Empleados por Nombre ---");
        // b) 
        String nombreBusqueda1 = "Carlos Johnson";
        Empleado empleadoEncontrado1 = archivoEmpleado.buscaEmpleado(nombreBusqueda1);
        if (empleadoEncontrado1 != null) {
            System.out.println("Empleado '" + nombreBusqueda1 + "' encontrado: " + empleadoEncontrado1);
        } else {
            System.out.println("Empleado '" + nombreBusqueda1 + "' no encontrado.");
        }

        String nombreBusqueda2 = "Maria Celeste";
        Empleado empleadoEncontrado2 = archivoEmpleado.buscaEmpleado(nombreBusqueda2);
        if (empleadoEncontrado2 != null) {
            System.out.println("Empleado '" + nombreBusqueda2 + "' encontrado: " + empleadoEncontrado2);
        } else {
            System.out.println("Empleado '" + nombreBusqueda2 + "' no encontrado.");
        }

        String nombreBusqueda3 = "David Lopez";
        Empleado empleadoEncontrado3 = archivoEmpleado.buscaEmpleado(nombreBusqueda3);
        if (empleadoEncontrado3 != null) {
            System.out.println("Empleado '" + nombreBusqueda3 + "' encontrado: " + empleadoEncontrado3);
        } else {
            System.out.println("Empleado '" + nombreBusqueda3 + "' no encontrado.");
        }

        System.out.println("\n--- Buscando Empleado con Salario Mayor ---");
        // c) 
        float sueldoMinimo1 = 50000.00f;
        Empleado empleadoMayorSalario1 = archivoEmpleado.mayorSalario(sueldoMinimo1);
        if (empleadoMayorSalario1 != null) {
            System.out.println("Primer empleado con salario mayor a " + String.format("%.2f", sueldoMinimo1) + ": " + empleadoMayorSalario1);
        } else {
            System.out.println("Ningun empleado encontrado con salario mayor a " + String.format("%.2f", sueldoMinimo1) );
        }

        float sueldoMinimo2 = 75000.00f;
        Empleado empleadoMayorSalario2 = archivoEmpleado.mayorSalario(sueldoMinimo2);
        if (empleadoMayorSalario2 != null) {
            System.out.println("Primer empleado con salario mayor a " + String.format("%.2f", sueldoMinimo2) + ": " + empleadoMayorSalario2);
        } else {
            System.out.println("Ningun empleado encontrado con salario mayor a " + String.format("%.2f", sueldoMinimo2));
        }

        System.out.println("\nContenido final del archivo '" + nombreArchivo + "':");
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo para mostrar su contenido final: " + e.getMessage());
        }
    }
}
