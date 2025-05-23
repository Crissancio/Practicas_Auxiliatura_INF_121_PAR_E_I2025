/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicac1;
public class Habitacion {
    protected String nombre;
    protected double tamaño;
    public Habitacion(String a,double b){
        this.nombre=a;
        this.tamaño=b;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    public void mostrar()
    {
        System.out.println("Nombre "+nombre+"tamaño "+tamaño+"m^2");
    }
}
