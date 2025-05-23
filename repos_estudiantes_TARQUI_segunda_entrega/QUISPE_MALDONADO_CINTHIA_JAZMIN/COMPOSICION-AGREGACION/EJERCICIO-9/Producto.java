/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9agreg;

/**
 *
 * @author CINTHIA
 */
public class Producto {
    private int precio;
    private String nombre;
    public Producto(String nom,int pre){
        this.nombre=nom;
        this.precio=pre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrar(){
        
        System.out.println("nombre:"+this.nombre);
         System.out.println("precio:"+this.precio);
    }
}
