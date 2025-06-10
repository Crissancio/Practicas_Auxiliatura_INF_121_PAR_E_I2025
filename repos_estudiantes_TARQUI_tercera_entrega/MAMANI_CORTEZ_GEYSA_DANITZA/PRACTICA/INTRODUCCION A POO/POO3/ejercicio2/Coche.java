/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Administrador
 */
public class Coche {
    private  String marca, modelo ;
    private int velocidad;

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    //a) Agrega un método acelerar () que aumente la velocidad en 10
     public void acelerar() {
        velocidad += 10;
        System.out.println(marca + " " + modelo + "  Velocidad: " + velocidad);
    }
     //b) Agrega un método frenar () que disminuya la velocidad en 5
    public void frenar() {
        if (velocidad >= 5) {
            velocidad -= 5;
        } else {
            velocidad = 0;
        }
        System.out.println(marca + " " + modelo + " Velocidad: " + velocidad);
    }
}
