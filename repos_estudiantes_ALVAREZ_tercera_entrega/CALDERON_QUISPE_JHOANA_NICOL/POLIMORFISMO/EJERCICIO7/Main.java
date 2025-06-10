package EJERCICIO7;

public class Main {
    public static void main(String[] args) {

        Cocinero cocinero1 = new Cocinero("Rafael", 1000, 10, 5.5f);

        Mesero mesero1 = new Mesero("Nayeli", 900, 5, 6.0f, 100f);
        Mesero mesero2 = new Mesero("Belen", 950, 8, 5.0f, 80f);

        Administrativo admin1 = new Administrativo("Zulema", 1200f, "Jefa de área");
        Administrativo admin2 = new Administrativo("Pepe", 1000f, "Asistente");

        cocinero1.mostrar();
        mesero1.mostrar();
        mesero2.mostrar();
        admin1.mostrar();
        admin2.mostrar();

        float sueldoX = 1000f;
        System.out.println("\nEmpleados con sueldo mensual igual a " + sueldoX + ":");

        if (cocinero1.sueldoEsIgual(sueldoX))
            cocinero1.mostrar();
        if (mesero1.sueldoEsIgual(sueldoX))
            mesero1.mostrar();
        if (mesero2.sueldoEsIgual(sueldoX))
            mesero2.mostrar();
        if (admin1.sueldoEsIgual(sueldoX))
            admin1.mostrar();
        if (admin2.sueldoEsIgual(sueldoX))
            admin2.mostrar();
    }
}
