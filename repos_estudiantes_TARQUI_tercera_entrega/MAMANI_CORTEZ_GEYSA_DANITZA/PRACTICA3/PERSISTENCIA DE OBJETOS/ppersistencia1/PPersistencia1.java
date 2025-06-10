/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppersistencia1;

/**
 *
 * @author Administrador
 */
public class PPersistencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");
        archivo.crearArchivo();

        Empleado e1 = new Empleado("Jose", 35, 3900);
        Empleado e2 = new Empleado("Luis", 45, 4200);
        Empleado e3 = new Empleado("Maria", 28, 3100);
        //a)Implementa el método guardarEmpleado(Empleado e) para almacenar empleados.
        archivo.guardarEmpleado(e1);
        archivo.guardarEmpleado(e2);
        archivo.guardarEmpleado(e3);
        //b)Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos del Empleado n.
        System.out.println("----Buscar empleado:-----");
        Empleado buscado = archivo.buscaEmpleado("Luis");
        System.out.println(buscado);
        //c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con sueldo mayor al ingresado.
        System.out.println("---- Empleado con salario mayor a 3200:----");
        Empleado mayor = archivo.mayorSalario(3200);
        System.out.println(mayor);
    }
    
}
