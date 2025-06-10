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
public class Administrativo {
    private String nombre,cargo;
    private float sueldoMes;

    public Administrativo(String nombre, float sueldoMes,String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoMes = sueldoMes;
    }
    
    public double sueldoTotal() {
        return sueldoMes;
    }
    public double sueldoTotal(int sueldoMes) {
        return sueldoMes;
    }
    public void mostrar(int x){
       if (sueldoMes == x) {
            System.out.println("Empleado: "+nombre);
        }
       else{
            System.out.println("El empleado no tiene un sueldo igual");
        }
    }
}
