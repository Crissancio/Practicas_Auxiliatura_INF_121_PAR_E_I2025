/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author Administrador
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a) Crear e instanciar al menos 2 bloques de cada tipo
        // BLOQUE COFRE
        
        BloqueCofre cofre1 = new BloqueCofre(20, 100, "hierro");
        BloqueCofre cofre2 = new BloqueCofre(40, 150, "oro");

        // BLOQUE TNT
        BloqueTnt tnt1 = new BloqueTnt("normal", 50);
        BloqueTnt tnt2 = new BloqueTnt("super", 100);

        // BLOQUE HORNO
        BloqueHorno horno1 = new BloqueHorno("plateado", 3);
        BloqueHorno horno2 = new BloqueHorno("negro", 5);

        // b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
        System.out.println("*** ACCIONES ***");
        cofre1.accion();
        tnt1.accion();
        horno1.accion();
        //c) Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
        System.out.println("\n*** COLOCAR ***");
        cofre2.colocar("pared");
        tnt2.colocar("suelo");
        horno2.colocar();
        //Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
        System.out.println("\n*** ROMPER ***");
        cofre1.romper();
        tnt1.romper();
        horno1.romper();
    }
    
}
