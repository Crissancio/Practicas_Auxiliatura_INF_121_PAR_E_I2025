package persistencia;

public class Main {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("MiArchivo");

        archivo.guardarEmpleado(new Empleado("Ana", 30, 5000));
        archivo.guardarEmpleado(new Empleado("Luis", 25, 3000));
        archivo.guardarEmpleado(new Empleado("Marta", 40, 7000));

        Empleado buscado = archivo.buscaEmpleado("Luis");
        if (buscado != null) {
            System.out.println("Empleado encontrado: " + buscado.nombre);
        } else {
            System.out.println("Empleado no encontrado.");
        }

        Empleado mayor = archivo.mayorSalario(4000);
        if (mayor != null) {
            System.out.println("Empleado con mayor salario: " + mayor.nombre);
        } else {
            System.out.println("Ningún empleado supera ese salario.");
        }
    }
}