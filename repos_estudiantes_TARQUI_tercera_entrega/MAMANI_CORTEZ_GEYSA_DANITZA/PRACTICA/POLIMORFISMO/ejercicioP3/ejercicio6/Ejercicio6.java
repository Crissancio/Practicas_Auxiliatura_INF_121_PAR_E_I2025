/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Administrador
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        //a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
        Cocinero cocinero1 = new Cocinero("Carolina", 2100, 10, 15);
        
        Mesero mesero1 = new Mesero("Lucia", 1200, 3, 10, 290);
        Mesero mesero2 = new Mesero("Santiago", 1200, 9, 10, 180);
        
        Administrativo admin1 = new Administrativo("Laura", 2500, "Contadora");
        Administrativo admin2 = new Administrativo("Marco", 2300, "Gerente");
        //b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
        //sumándole las horas extra, considerando el sueldo por hora y la propina
        //en caso de los meseros.
        System.out.println("*** SUELDOS TOTALES ***");
        System.out.println("Cocinero: "+cocinero1.sueldoTotal());
        System.out.println("Mesero 1: "+mesero1.sueldoTotal());
        System.out.println("Mesero 2: "+mesero2.sueldoTotal());
        System.out.println("Administrativo 1: "+admin1.sueldoTotal());
        System.out.println("Administrativo 2: "+admin2.sueldoTotal());
        //c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.
        System.out.println("--Cocineros--");
        cocinero1.mostrar(1500);
        System.out.println("\n--Meseros--");
        mesero1.mostrar(1200);
        mesero2.mostrar(2000);
        System.out.println("\n--Administrativo--");
        admin1.mostrar(1400);
        admin2.mostrar(2300);
    }

   
    
}
