/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5genericidad;

/**
 *
 * @author CINTHIA
 */
public class Productos {
    private String nombre;
    private int precio;
    public Productos(String nombre,int precio){
        this.nombre=nombre;
        this.precio=precio;
        
    }
    @Override
    public String toString() {
        return "Producto: " + nombre + "  Precio:" + precio+"$";
    }
   
}
