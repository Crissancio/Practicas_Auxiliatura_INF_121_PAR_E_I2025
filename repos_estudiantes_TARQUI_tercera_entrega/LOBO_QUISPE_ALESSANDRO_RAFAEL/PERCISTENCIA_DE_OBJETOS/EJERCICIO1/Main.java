public class Main {
    public static void main(String[] args) {
        // Crear archivo de empleados
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");

        // Agregar algunos empleados
        archivo.guardarEmpleado(new Empleado("Juan Pérez", 35, 2500.50f));
        archivo.guardarEmpleado(new Empleado("María García", 28, 3200.75f));
        archivo.guardarEmpleado(new Empleado("Carlos López", 42, 1800.30f));

        // Buscar un empleado por nombre
        Empleado encontrado = archivo.buscaEmpleado("María García");
        if (encontrado != null) {
            System.out.println("Empleado encontrado: " + encontrado);
        } else {
            System.out.println("Empleado no encontrado");
        }

        // Buscar empleado con mayor salario que 2000
        Empleado mayorSalario = archivo.mayorSalario(2000.0f);
        if (mayorSalario != null) {
            System.out.println("Empleado con salario mayor a 2000: " + mayorSalario);
        } else {
            System.out.println("No hay empleados con salario mayor a 2000");
        }
    }
}
