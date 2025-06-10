/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Administrador
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //9. Realiza la abstracción de una Computadora
        
        System.out.println("---COMPONENTES DE LA COMPUTADORA---");
        Computadora pc1 = new Computadora("Intel i7", 16, 512);
        pc1.mostrar();
        //c) Crea una instancia y simula encender y apagar la computadora.
        pc1.encender();
        pc1.mostrar();
        pc1.apagar();
        pc1.mostrar();
    }
    
}
