/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERSISTENCIA_DE_OBJETOS.EJER_1;
public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.bin");

        // a) Guardar empleados
        Empleado e1 = new Empleado("Maria", 25, 2800f);
        Empleado e2 = new Empleado("Carlos", 30, 3500f);
        archivo.guardarEmpleado(e1);
        archivo.guardarEmpleado(e2);

        // b) Buscar por nombre
        Empleado buscado = archivo.buscaEmpleado("Carlos");
        if (buscado != null) {
            System.out.println("Empleado encontrado: " + buscado);
        } else {
            System.out.println("Empleado no encontrado.");
        }

        // c) Buscar salario mayor a
        Empleado mejorPagado = archivo.mayorSalario(3000f);
        if (mejorPagado != null) {
            System.out.println("Empleado con salario mayor: " + mejorPagado);
        } else {
            System.out.println("Ningún empleado con salario mayor.");
        }
    }
}

