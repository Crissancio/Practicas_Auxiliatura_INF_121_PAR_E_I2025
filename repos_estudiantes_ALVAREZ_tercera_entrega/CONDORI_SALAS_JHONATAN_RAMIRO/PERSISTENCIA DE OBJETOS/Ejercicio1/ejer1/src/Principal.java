public class Principal {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");
        archivo.crearArchivo();
        Empleado e1 = new Empleado("Luis", 30, 2500);
        Empleado e2 = new Empleado("Ana", 28, 3000);
        Empleado e3 = new Empleado("Mario", 40, 1800);
        archivo.guardarEmpleado(e1);
        archivo.guardarEmpleado(e2);
        archivo.guardarEmpleado(e3);
        System.out.println("Buscar Empleado Ana:");
        Empleado encontrado = archivo.buscaEmpleado("Ana");
        System.out.println(encontrado != null ? encontrado : "No encontrado");
        System.out.println("\nEmpleado con salario mayor a 2000:");
        Empleado mejor = archivo.mayorSalario(2000);
        System.out.println(mejor != null ? mejor : "No hay");
    }
}