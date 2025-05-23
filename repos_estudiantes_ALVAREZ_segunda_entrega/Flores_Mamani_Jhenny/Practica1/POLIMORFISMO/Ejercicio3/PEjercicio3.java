/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pejercicio3;

/**
 *
 * @author WINDOWS 11
 */

public class PEjercicio3{
    public static void main(String[] args) {
        
        Cocinero cocinero1 = new Cocinero("Luis", 1200, 10, 5.5f);
        cocinero1.mostrar(true);
        System.out.println();

        
        Mesero mesero1 = new Mesero("Ana", 900, 150);
        mesero1.mostrar(true);
        System.out.println();

      
        Administrativo admin1 = new Administrativo("Carlos", 1500, 2, 80);
        admin1.mostrar(true);
    }
}

