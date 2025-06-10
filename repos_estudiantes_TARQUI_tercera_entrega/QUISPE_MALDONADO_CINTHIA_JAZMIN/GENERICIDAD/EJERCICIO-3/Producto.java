/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3genericidad;

/**
 *
 * @author CINTHIA
 */
public class Producto {
    private String nombre;
    private int precio;
    public Producto(String nombre,int precio){
        this.nombre=nombre;
        this.precio=precio;
        
    }
    @Override
    public String toString() {
        return "Producto: " + nombre + "  Precio:" + precio+"$";
    }
    @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Producto otro = (Producto) obj;
            return nombre.equals(otro.nombre) && precio == otro.precio;
        }

}
