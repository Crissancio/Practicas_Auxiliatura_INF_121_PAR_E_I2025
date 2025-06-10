/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaatres;

/**
 *
 * @author Usuario
 */
public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0; 
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void acelerar(){
        velocidad += 10;
    }
    public void frenar(){
        velocidad-=5;
        if (velocidad < 0){
            velocidad= 0;
        }
    }
    @Override
    public String toString(){
        return ("Marca: "+ marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad ); 
    }
}
