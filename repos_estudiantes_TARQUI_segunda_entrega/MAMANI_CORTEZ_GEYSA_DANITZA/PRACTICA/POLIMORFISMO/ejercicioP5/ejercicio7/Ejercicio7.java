/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author Administrador
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
        Oficina ofi1=new Oficina(20,10,2);
        System.out.println("--- Oficina 1 ---");
        ofi1.mostrar();
        Oficina ofi2=new Oficina(30,15,1);
        System.out.println("\n--- Oficina 2 ---");
        ofi2.mostrar();
        Aula a1=new Aula("3ro B",30,25);
        System.out.println("\n--- Aula 1---");
        a1.mostrar();
        Aula a2=new Aula("6to C",20,25);
        System.out.println("\n---Aula 2 ---");
        a2.mostrar();
        Laboratorio lab=new Laboratorio("Lab 1",20,20,40);
        System.out.println("\n--- Laboratorio ---");
        lab.mostrar();
        
         // c) Sobrecargar el método cantidadMuebles(), para conocer el número total demuebles dentro de cada ambiente
        System.out.println("\n--- Cantidad de Muebles ---");
        System.out.println("Oficina 1: " + ofi1.cantidadMuebles() + " muebles");
        System.out.println("Aula 1: " + a1.cantidadMuebles() + " muebles");
        System.out.println("Laboratorio: " + lab.cantidadMuebles() + " muebles");
        
        System.out.println("\n- ---SOBRECARGA 3 ---");
        System.out.println("Oficina 2: " + ofi2.cantidadMuebles(3) + " muebles");
        System.out.println("Laboratorio 2: " + lab.cantidadMuebles(15) + " muebles");
        System.out.println("Aula 2: " + a2.cantidadMuebles(10) + " muebles");
    }
    
}
