package Persistencia.Ejer1.codigo;

//1. Sea el siguiente diagrama de clases:
//a) Implementa el método guardarEmpleado(Empleado e) para almacenar
//empleados.
//b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos
//del Empleado n.
//c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con
//sueldo mayor al ingresado.


public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.txt");
        archivo.crearArchivo();

        Empleado e1 = new Empleado("Julian", 28, 3000f);
        Empleado e2 = new Empleado("Marcos", 35, 4500f);
        Empleado e3 = new Empleado("Trevor", 40, 2800f);

        archivo.guardarEmpleado(e1);
        archivo.guardarEmpleado(e2);
        archivo.guardarEmpleado(e3);

        System.out.println("Empleado buscado: " + archivo.buscaEmpleado("Marcos"));
        System.out.println("Empleado con mayor salario: " + archivo.mayorSalario(2500f));


    }
}

