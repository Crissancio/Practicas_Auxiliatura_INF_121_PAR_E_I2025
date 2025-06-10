import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ArchivoEmpleado archivo = new ArchivoEmpleado("Empleados/empleados");

        archivo.guardarEmpleado(new Empleado("Ana", 30, 1000));
        archivo.guardarEmpleado(new Empleado("Luis", 40, 1500));
        archivo.guardarEmpleado(new Empleado("Eva", 25, 800));

        Empleado buscado = archivo.buscaEmpleado("Eva");
        System.out.println("BUSCADO: " + buscado);

        Empleado mayorSal = archivo.mayorSalario(900f);
        System.out.println("MAYOR SALARIO > 900: " + mayorSal);
    }
}
