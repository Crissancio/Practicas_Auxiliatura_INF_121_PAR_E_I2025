/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3.ejer1.per;

/**
 *
 * @author Adrian
 */
/*
Ejercicio 1 : Persistencia
a) Implementa el método guardarEmpleado(Empleado e) para almacenar  empleados. 
b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos  del Empleado n. 
c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con  sueldo mayor al ingresado.
*/
public class P3Ejer1Per {

    public static void main(String[] args) {
        ArchivoEmpleado arch = new ArchivoEmpleado("empleados.txt");

        arch.crearArchivo();

        // a) guardando al empleado usando el metodo guardarEmpleado(Empleado e)
        Empleado e1 = new Empleado("Juan", 30, 2500);
        Empleado e2 = new Empleado("Ana", 28, 3200);
        Empleado e3 = new Empleado("Luis", 45, 4000);
        arch.guardarEmpleado(e1);
        arch.guardarEmpleado(e2);
        arch.guardarEmpleado(e3);

        // b) buscando el empleado usando el meyodo de buscaEmpleado(String n)
        Empleado buscado = arch.buscaEmpleado("Ana");
        if (buscado != null) {
            System.out.println("Empleado encontrado: " + buscado.toString());
        } else {
            System.out.println("Empleado no encontrado.");
        }

        // c) el mayor salario del empeado usando el metodo mayorSalario(float s)
        Empleado conMayorSalario = arch.mayorSalario(3000);
        if (conMayorSalario != null) {
            System.out.println("Empleado con salario mayor a 3000: " + conMayorSalario.toString());
        } else {
            System.out.println("No se encontró empleado con salario mayor.");
        }
    }
}

