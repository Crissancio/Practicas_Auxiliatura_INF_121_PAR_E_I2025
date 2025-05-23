/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagregacion2;

/**
 *
 * @author Administrador
 */
public class PAgregacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a) y b)  Crear carrito y varios productos (prueba del límite)
        CarritoCompras carrito = new CarritoCompras();
        Producto p1=new Producto("Papaya",10);
        Producto p2=new Producto("Mazana",20);
        Producto p3=new Producto("Fresa",5.5);
        Producto p4=new Producto("Frambuesa",15);
        Producto p5=new Producto("Uva",10.9);
        Producto p6=new Producto("Guayaba",10);
        Producto p7=new Producto("Maracuya",20);
        Producto p8=new Producto("Sandia",18.5);
        Producto p9=new Producto("Arandano",7.8);
        Producto p10=new Producto("Mora",5.5);
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);
        carrito.agregarProducto(p4);
        carrito.agregarProducto(p5);
        carrito.agregarProducto(p6);
        carrito.agregarProducto(p7);
        carrito.agregarProducto(p8);
        carrito.agregarProducto(p9);
        carrito.agregarProducto(p10);
         

        // c) Mostrar contenido final del carrito
        carrito.mostrarInfo();
    }
    
}
