/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5compo;

/**
 *
 * @author CINTHIA
 */
public class Jugador {
    private String nombre,posicion;
    private int numero;
    public Jugador(String nom,int nu,String pos){
        this.nombre=nom;
        this.numero=nu;
        this.posicion=pos;
    }
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Numero: "+this.numero);
        System.out.println("Posicion: "+this.posicion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumero() {
        return numero;
    }
    
}
