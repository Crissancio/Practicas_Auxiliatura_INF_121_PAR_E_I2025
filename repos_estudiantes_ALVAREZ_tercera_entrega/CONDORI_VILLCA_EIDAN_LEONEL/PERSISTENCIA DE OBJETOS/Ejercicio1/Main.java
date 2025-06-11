package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");
        archivo.crearArchivo();

        archivo.guardarEmpleado(new Empleado("Ana", 30, 5000f));
        archivo.guardarEmpleado(new Empleado("Luis", 40, 3000f));
        archivo.guardarEmpleado(new Empleado("Maria", 28, 4500f));

        System.out.println("Buscar 'Luis': " + archivo.buscaEmpleado("Luis"));
        System.out.println("Mayor a 4600: " + archivo.mayorSalario(4600f));
    }
}
