package Ejercicio_1P;
/*1. Sea el siguiente diagrama de clases:
a) Implementa el método guardarEmpleado(Empleado e) para almacenar
empleados.
b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos
del Empleado n.
c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con
sueldo mayor al ingresado.*/

public class Main {
 public static void main(String[] args) {
     ArchivoEmpleado archivo = new ArchivoEmpleado();

     archivo.guardarEmpleado(new Empleado("Ana", 1, 5000));
     archivo.guardarEmpleado(new Empleado("Luis", 2, 8000));

     System.out.println("Buscar: " + archivo.buscaEmpleado("Luis"));
     System.out.println("Mayor al sueldo 6000: " + archivo.mayorSalario(6000));
 }
}

