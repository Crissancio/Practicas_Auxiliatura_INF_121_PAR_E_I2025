package Polimorfismo.Ej3;

public class Main {
    public static void main(String[] args) {
        Cocinero c1 = new Cocinero("Luis", 800, 10, 20);
        Mesero m1 = new Mesero("Carlos", 700, 5, 15, 50);
        Mesero m2 = new Mesero("Ana", 700, 8, 15, 40);
        Administrativo a1 = new Administrativo("Pedro", 900, "Jefe de compras");
        Administrativo a2 = new Administrativo("Marta", 1000, "Gerente");

        System.out.println("Sueldos Totales:");
        System.out.println("Cocinero: $" + c1.sueldoTotal());
        System.out.println("Mesero 1: $" + m1.sueldoTotal());
        System.out.println("Mesero 2: $" + m2.sueldoTotal());
        System.out.println("Admin 1: $" + a1.sueldoTotal());
        System.out.println("Admin 2: $" + a2.sueldoTotal());

        System.out.println("\nFiltrar por sueldoMes == 700:");
        c1.sueldoTotal(700);
        m1.sueldoTotal(700);
        m2.sueldoTotal(700);
        a1.sueldoTotal(700);  // Usa float
    }
}
