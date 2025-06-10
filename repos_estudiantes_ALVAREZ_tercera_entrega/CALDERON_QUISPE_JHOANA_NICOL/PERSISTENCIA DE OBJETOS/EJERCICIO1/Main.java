package EJERCICIO1;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado(
                "C:\\Users\\SAMSUNG\\Desktop\\PERSISTENCIA DE OBJETOS\\EJERCICIO1\\empleados.txt");

        archivo.crearArchivo();
        archivo.guardarEmpleado(new Empleado("Diego", 19, 3000f));
        archivo.guardarEmpleado(new Empleado("Rafael", 25, 4500f));
        archivo.guardarEmpleado(new Empleado("Jhoana", 18, 2000f));

        System.out.println("\nBuscar empleado 'Jhoana'");
        Empleado buscado = archivo.buscaEmpleado("Jhoana");
        System.out.println(buscado != null ? buscado : "No encontrado");

        System.out.println("\nEmpleado con salario mayor a 2500");
        Empleado mayor = archivo.mayorSalario(2500f);
        System.out.println(mayor != null ? mayor : "No hay empleados con salario mayor");
    }
}
