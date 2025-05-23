/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaatres;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PracticaAtres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche1 = new Coche("toyota","Corolla");
        Coche coche2 = new Coche("Ford","Mustang");
        coche1.acelerar();
        coche1.frenar();
        coche1.frenar();
        
        coche2.acelerar();
        coche2.acelerar();
        coche2.frenar();
        
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
    }
    
}
