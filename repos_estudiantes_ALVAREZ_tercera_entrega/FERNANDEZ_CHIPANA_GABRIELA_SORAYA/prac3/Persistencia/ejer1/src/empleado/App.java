/*a) Implementa el método guardarEmpleado(Empleado e) para almacenar
empleados.
b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos
del Empleado n.
c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con
sueldo mayor al ingresado.*/
package empleado;
public class App {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.txt");
        archivo.crearArchivo();

        archivo.guardarEmpleado(new Empleado("Ana", 30, 3500));
        archivo.guardarEmpleado(new Empleado("Luis", 25, 4200));
        archivo.guardarEmpleado(new Empleado("Maria", 40, 5000));

        Empleado buscado = archivo.buscaEmpleado("Luis");
        System.out.println("Empleado encontrado: " + buscado);

        Empleado mayorSal = archivo.mayorSalario(4000);
        System.out.println("Empleado con salario mayor a 4000: " + mayorSal);
    }
}

