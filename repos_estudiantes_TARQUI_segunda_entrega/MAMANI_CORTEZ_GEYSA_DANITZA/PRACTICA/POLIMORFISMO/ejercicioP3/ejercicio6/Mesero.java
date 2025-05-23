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
public class Mesero {
    private String nombre;
    private int SueldoMes, horasExtra;
    private float sueldoHora, propina;
    
    public Mesero(String nombre, int SueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.SueldoMes = SueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }
    public double sueldoTotal() {
        return SueldoMes+(sueldoHora*horasExtra)+propina;
    }
    public double sueldoTotal(int propina) {
        return SueldoMes+(sueldoHora*horasExtra)+propina;
    }

    
    public void mostrar(int x){
        if (SueldoMes == x) {
            System.out.println("Empleado: "+nombre);
        }
        else{
            System.out.println("El empleado no tiene un sueldo igual");
        }
    }
    
}
