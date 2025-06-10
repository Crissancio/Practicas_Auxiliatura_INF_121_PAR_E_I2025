/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GENERECIDAD.EJER_1;

public class Main {
    public static void main(String[] args) {
        // b) Crear dos instancias de la caja con diferentes tipos
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola Mundo");
        
        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(42);
        
        // c) Mostrar el contenido de las cajas
        System.out.println("Caja de texto contiene: " + cajaTexto.obtener());
        System.out.println("Caja de numero contiene: " + cajaNumero.obtener());
    }
}
