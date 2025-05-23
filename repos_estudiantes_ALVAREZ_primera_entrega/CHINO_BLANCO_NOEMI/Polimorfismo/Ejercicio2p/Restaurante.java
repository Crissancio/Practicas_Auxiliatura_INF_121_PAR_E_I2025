/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionpoo.polimorfismo;

class Cocinero {
    String nombre;
    int sueldoMes, horasExtra;
    float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    public float sueldoTotal() {
        return sueldoMes + horasExtra * sueldoHora;
    }
}

class Mesero {
    String nombre;
    int sueldoMes, horasExtra;
    float sueldoHora, propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public float sueldoTotal() {
        return sueldoMes + horasExtra * sueldoHora + propina;
    }
}

class Administrativo {
    String nombre, cargo;
    float sueldoMes;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return sueldoMes;
    }
}

public class Restaurante {
    public static void main(String[] args) {
        Cocinero cocinero = new Cocinero("Luis", 2500, 10, 15);
        Mesero mesero1 = new Mesero("Ana", 1500, 5, 10, 200);
        Mesero mesero2 = new Mesero("Pedro", 1600, 8, 12, 150);
        Administrativo admin1 = new Administrativo("Laura", 2000, "Contadora");
        Administrativo admin2 = new Administrativo("Carlos", 2000, "RRHH");

        Object[] empleados = { cocinero, mesero1, mesero2, admin1, admin2 };

        System.out.println("Sueldos Totales:");
        System.out.println("noemi chino blanco");

        // debe ser un metodo de las clases
        for (Object emp : empleados) {
            String nombre = "";
            float sueldo = 0;
            if (emp instanceof Cocinero) {
                Cocinero c = (Cocinero) emp;
                nombre = c.nombre;
                sueldo = c.sueldoTotal();
            } else if (emp instanceof Mesero) {
                Mesero m = (Mesero) emp;
                nombre = m.nombre;
                sueldo = m.sueldoTotal();
            } else if (emp instanceof Administrativo) {
                Administrativo a = (Administrativo) emp;
                nombre = a.nombre;
                sueldo = a.sueldoTotal();
            }
            System.out.println(nombre + ": $" + sueldo);
        }

        float x = 2000;
        System.out.println("\nEmpleados con sueldo mensual igual a " + x + ":");
        for (Object emp : empleados) {
            if (emp instanceof Cocinero) {
                Cocinero c = (Cocinero) emp;
                if (c.sueldoMes == x) System.out.println(c.nombre);
            } else if (emp instanceof Mesero) {
                Mesero m = (Mesero) emp;
                if (m.sueldoMes == x) System.out.println(m.nombre);
            } else if (emp instanceof Administrativo) {
                Administrativo a = (Administrativo) emp;
                if (a.sueldoMes == x) System.out.println(a.nombre);
            }
        }
    }
}
