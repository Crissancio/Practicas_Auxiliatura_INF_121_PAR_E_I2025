/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion;

/**
 *
 * @author Usuario
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("\n=== Juego: Adivina Número ===");
        juego1.juega();

        System.out.println("\n=== Juego: Adivina Número PAR ===");
        juego2.juega();

        System.out.println("\n=== Juego: Adivina Número IMPAR ===");
        juego3.juega();
    }
    
}
