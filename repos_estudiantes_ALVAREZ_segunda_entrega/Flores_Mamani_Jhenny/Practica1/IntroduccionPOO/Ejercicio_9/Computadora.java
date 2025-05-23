/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_9;

/**
 *
 * @author WINDOWS 11
 */
public class Computadora {
    private String procesador;
    private int ram; 
    private int almacenamiento; 
    private String tarjetaGrafica;
    private boolean estaEncendida;

    public Computadora(String procesador, int ram, int almacenamiento, String tarjetaGrafica) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tarjetaGrafica = tarjetaGrafica;
        this.estaEncendida = false;
    }

   
    public void mostrarComponentes() {
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Tarjeta Gráfica: " + tarjetaGrafica);
    }

    
    public void encender() {
    System.out.println(estaEncendida ? "La computadora ya está encendida." : "La computadora se ha encendido.");
    estaEncendida = true;
}

public void apagar() {
    System.out.println(estaEncendida ? "La computadora se ha apagado." : "La computadora ya está apagada.");
    estaEncendida = false;
}


   
    public void mostrarEstado() {
        if (estaEncendida) {
            System.out.println(" prendida");
        } else {
            System.out.println(" Apagada");
        }
    }

  
}

