package PERSISTENCIA.Ejercicio1.Java;

public class Main{
    public static void main(String[] args) {
        GestorEmpleado gestor = new GestorEmpleado();

        Empleado e1 = new Empleado("Luis", 30, 3000);
        Empleado e2 = new Empleado("Maria", 28, 4000);
        gestor.guardarEmpleado(e1);
        gestor.guardarEmpleado(e2);

        System.out.println("Buscar por nombre: Maria");
        System.out.println(gestor.buscaEmpleado("Maria"));

        System.out.println("Empleado con salario mayor a 3500:");
        System.out.println(gestor.mayorSalario(3500));
    }
}
