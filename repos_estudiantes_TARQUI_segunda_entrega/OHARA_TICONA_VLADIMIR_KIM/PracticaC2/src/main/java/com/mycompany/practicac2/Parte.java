/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicac2;

/**
 *
 * @author Usuario
 */
public class Parte {
    private String nombre;
    private double peso;
    public Parte(String a,double b)
    {
        this.nombre=a;
        this.peso=b;
    }
    public String getNombre() {
        return nombre;   }
   public void setNombre(String nombre) {
        this.nombre = nombre;    }
    public double getPeso() {
        return peso;  }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void Mostrar() {
        System.out.println("Parte del avion "+ nombre+ "peso " + peso + '}');
    }   
}
