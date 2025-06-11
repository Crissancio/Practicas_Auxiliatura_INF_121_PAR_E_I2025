/*
 * 
 * 
 * ------------------ EJERCICIO 1 ------------------
 * 
 * 
 * 
a) Implementa el método guardarEmpleado(Empleado e) para almacenar
empleados.
b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos
del Empleado n.
c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con
sueldo mayor al ingresado.
 * 
 * 
 */
public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("d:/UMSA/SEGUNDO SEMESTRE/PROGRAMACION II/PRACTICAS AUX/PRACTICA#3/PERSISTENCIA/1/JAVA/empleados.txt");
        archivo.crearArchivo();
        
        // a)
        Empleado empleado1 = new Empleado("Juan", 30, 5000.0f);
        Empleado empleado2 = new Empleado("Maria", 25, 6000.0f);
        archivo.guardarEmpleado(empleado1);
        archivo.guardarEmpleado(empleado2);
        
        // b)
        Empleado encontrado = archivo.buscaEmpleado("Maria");
        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Empleado no encontrado");
        }
        
        // c)
        Empleado mayor = archivo.mayorSalario(5500.0f);
        if (mayor != null) {
            System.out.println("Primer empleado con salario mayor a 5500: " + mayor);
        } else {
            System.out.println("No hay empleados con salario mayor a 5500");
        }
    }
}