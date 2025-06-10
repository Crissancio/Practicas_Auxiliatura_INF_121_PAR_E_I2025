/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposicion2;

/**
 *
 * @author Administrador
 */
public class Parte {
    private String nombre;
    private double peso;

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void mostrarInfo(){
        System.out.println("\t"+nombre+" "+peso);
    }
}
