/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac.agre1;

/**
 *
 * @author WINDOWS 11
 */
public class PracAgre1 {
    public static void main(String[] args) {
      
        Estdiante est1 = new Estdiante("lili Torres", "pediatriaa", 3);
        Estdiante est2 = new Estdiante("blu Pérez", "Medicina", 5);
        Estdiante est3 = new Estdiante("Marío Gómez", "informatia", 2);

   Universidad uni = new Universidad("Umsa");
        uni.agregarEstdiante(est1);
        uni.agregarEstdiante(est2);
        uni.agregarEstdiante(est3);

       
        uni.mostrarInfo();
    }
}
