/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaauno;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PracticaAuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> persona = new ArrayList<>();
        persona.add(new Persona("hola soy ","juan",54," Pando"));
        persona.add(new Persona("que tal mi nombre es ","Carlos",14," Tarija"));
        persona.add(new Persona("que tal todo soy ","Juan",24," Beni"));
        for (Persona person : persona){
            System.out.println(person);
            person.Mayor();
        }
     
    }
}