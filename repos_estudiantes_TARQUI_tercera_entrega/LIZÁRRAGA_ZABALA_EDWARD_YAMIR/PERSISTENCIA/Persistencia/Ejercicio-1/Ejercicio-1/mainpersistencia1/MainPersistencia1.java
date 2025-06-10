
package mainpersistencia1;

public class MainPersistencia1 {
    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");

        // a) Crear archivo
        archivo.crearArchivo();

        // a) Guardar empleados
        archivo.guardarEmpleado(new Empleado("Pedro", 40, 3200));
        archivo.guardarEmpleado(new Empleado("Ana", 30, 2700));
        archivo.guardarEmpleado(new Empleado("Luis", 50, 4500));

        // b) Buscar empleado por nombre
        Empleado e = archivo.buscaEmpleado("Luis");
        if (e != null) System.out.println("Empleado encontrado: " + e);

        // c) Buscar empleado con salario mayor a 3000
        Empleado mayor = archivo.mayorSalario(3000);
        if (mayor != null) System.out.println("Empleado con mayor salario: " + mayor);
    }
}

