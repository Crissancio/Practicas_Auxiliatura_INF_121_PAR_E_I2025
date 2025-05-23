/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = (int)(Math.random() * 11);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) continue;

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número es mayor.");
                    } else {
                        System.out.println("El número es menor.");
                    }
                } else {
                    System.out.println("¡No te quedan más vidas! El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
}

