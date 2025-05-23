/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaco2;

/**
 *
 * @author Usuario
 */
public class Coche {
    String marca;
    String modelo;
    int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
    }

    public void frenar() {
        velocidad -= 5;
    }

    public void mostrarVelocidad() {
        System.out.println(marca + " " + modelo + " va a " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Ford", "Focus");

        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        c1.mostrarVelocidad();

        c2.acelerar();
        c2.frenar();
        c2.mostrarVelocidad();
    }
}

