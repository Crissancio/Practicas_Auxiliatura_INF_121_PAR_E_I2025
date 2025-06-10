/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2;
public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    Coche (String marca,String modelo,int velocidad){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidad=velocidad;
    }
    public void acelerar() {
        velocidad += 10;
    }
      public void frenar() {
        velocidad -= 5;
        if (velocidad < 0) velocidad = 0;
        
    }
     public void mostrarVelocidad(){ System.out.println(" el auto " + " "+marca+" "+modelo+" "+"su velocidad es"+velocidad);}
}
