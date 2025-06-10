/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pejercicio_7;

/**
 *
 * @author WINDOWS 11
 */
public class Pejercicio_7 {

    public static void main(String[] args) {
        
        BloqueCofre cofre1 = new BloqueCofre(50, 10, "Madera");
        BloqueCofre cofre2 = new BloqueCofre(100, 20, "Hierro");

      
        BloqueInt tnt1 = new BloqueInt("Clásica", 100);
        BloqueInt tnt2 = new BloqueInt("Mega", 250);

        
        BloqueHorno horno1 = new BloqueHorno("Gris", 5);
        BloqueHorno horno2 = new BloqueHorno("Negro", 10);

       
        cofre1.accion();
        cofre2.colocar("pared");
        cofre1.romper();

        System.out.println();

        tnt1.accion();
        tnt1.colocar();
        tnt2.romper();

        System.out.println();

        horno1.accion();
        horno2.colocar("pared");
        horno1.romper();
    }
}


