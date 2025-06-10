/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3genericidad;

/**
 *
 * @author CINTHIA
 */
public class Ejercicio3Genericidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Catalogo<Libro> cl=new Catalogo<>();
        Libro l1=new Libro("El velero de cristal","Jose Mauro");
        Libro l2=new Libro("Ojos de perro azul","Gabriel Garcia Marquez");
        Libro l3=new Libro("Amargos anios de un estudiante","Jaime Aduana Quintana");
        cl.agregar(l1);
        cl.agregar(l2);
        cl.agregar(l3);
        Catalogo<Producto> cp=new Catalogo<>();
        Producto p1=new Producto("Shampoo",25);
        Producto p2=new Producto("Espejo",64);
        Producto p3=new Producto("Cepillo",12);
        cp.agregar(p1);
        cp.agregar(p2);
        cp.agregar(p3);
        cl.mostrar();
        cp.mostrar();
       
        Libro l4 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Producto p4=new Producto("Jabon",19);
        System.out.println("-------------------------");
        System.out.println("Esta el libro = Ojos de perro azul?");
        cl.buscar(l2);
        System.out.println("Esta el libro = El Principito?");
        cl.buscar(l4);
        System.out.println("-------------------------");
        System.out.println("Esta el producto = Jabon?");
        cp.buscar(p4);
        System.out.println("Esta el producto = Cepillo?");
        cp.buscar(p3);
        
    }
    
}
