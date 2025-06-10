/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_7;

/**
 *
 * @author WINDOWS 11
 */

   public class Ejercicio_7{
  public static void main(String[] args) {
        // TODO code application logic here
        Celular c =new Celular();
        System.out.println(",,,,,,,,,Instalando ........");
        c.instalarApp("Instagram", 567);
        c.instalarApp("Facebook", 68);
        System.out.println("----- Usando -----");
        c.usarApp("Instagram", 45);
        c.usarApp("tick tokc", 56);
        System.out.println("----- Bateria -----");
        c.mostrarBateria();
        System.out.println("----- Uso extremo -----");
        c.usarApp("Instagram", 677);
        c.usarApp("Facebook", 145);
    }
}