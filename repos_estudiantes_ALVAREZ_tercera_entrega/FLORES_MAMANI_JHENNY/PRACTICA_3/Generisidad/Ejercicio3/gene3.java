/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gener5;

/**
 *
 * @author WINDOWS 11
 */
public class gene3 {

 
    public static void main(String[] args) {
        Catalogo<Libro> libros= new Catalogo<>();
        Libro L1= new Libro("patitas de pollo");
        Libro L2 =new Libro("yo ubiera ");
        libros.agregar(L1);
        libros.agregar(L2);
       System.out.println("___________catalogo de libros___________");
        libros.mostrarCatalogo();
        
         Catalogo<Producto>productos= new Catalogo<>();
        Producto p1= new Producto("aceite");
         Producto p2= new Producto("pancitito");
         productos.agregar(p1);
         productos.agregar(p2);

      
        System.out.println("_____________________catalogo de productos___________________");
        productos.mostrarCatalogo();
    
}
}
