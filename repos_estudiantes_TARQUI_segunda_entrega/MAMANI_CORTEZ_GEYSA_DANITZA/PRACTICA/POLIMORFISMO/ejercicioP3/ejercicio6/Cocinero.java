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
public class Cocinero {
   private String  nombre;
   private int sueldoMes, horasExtra;
   private float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }
    //b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,sumándole las horas extra, considerando el sueldo por hora y la propinaen caso de los meseros.
    public double sueldoTotal() {
        return sueldoMes+(horasExtra*sueldoHora);
    }
    public double sueldoTotal(int horasExtra) {
        return sueldoMes+(horasExtra*sueldoHora);
    }
    //c) Sobrecargar el método para mostrar a aquellos Empleados que tengan SueldoMes igual a X.
    public void mostrar(int x){
        if (sueldoMes == x) {
            System.out.println("Empleado: "+nombre);
        }
        else{
            System.out.println("El empleado no tiene un sueldo igual");
        }
    }
    
}
