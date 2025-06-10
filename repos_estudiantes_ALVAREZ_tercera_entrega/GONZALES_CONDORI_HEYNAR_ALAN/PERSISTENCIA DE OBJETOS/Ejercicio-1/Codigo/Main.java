package Ejercicio1;

import java.io.File;
/*
a) Implementa el método guardarEmpleado(Empleado e) para almacenar
empleados.
b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos
del Empleado n.
c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con
sueldo mayor al ingresado.
*/
public class Main {
    public static void main(String[] args) {
        // Eliminar el archivo antes de continuar para evitar datos corruptos
        File file = new File("empleados.dat");
        if (file.exists()) {
            file.delete();
        }

        // Crear el archivo de empleados
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");

        // Crear empleados
        Empleado emp1 = new Empleado("Juan", 30, 2500f);
        Empleado emp2 = new Empleado("Ana", 28, 3000f);
        Empleado emp3 = new Empleado("Pedro", 35, 3500f);

        // Guardar empleados en el archivo
        archivo.guardarEmpleado(emp1);
        archivo.guardarEmpleado(emp2);
        archivo.guardarEmpleado(emp3);

        // Buscar un empleado por nombre
        Empleado encontrado = archivo.buscarEmpleado("Ana");
        if (encontrado != null) {
            System.out.println("Empleado encontrado: " + encontrado);
        } else {
            System.out.println("Empleado no encontrado.");
        }

        // Buscar el empleado con el mayor salario
        Empleado mayorSalario = archivo.mayorSalario(2700f);
        if (mayorSalario != null) {
            System.out.println("Empleado con salario mayor a 2700: " + mayorSalario);
        } else {
            System.out.println("No se encontró empleado con salario mayor.");
        }
    }
}
