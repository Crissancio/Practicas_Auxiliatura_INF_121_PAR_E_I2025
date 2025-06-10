/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caja;

/**
 *
 * @author SIVEL
 */
public class App {
    public static void main(String[] args) {
       Caja<String> caja1 = new Caja<>();
caja1.guardar("Hola");

Caja<Integer> caja2 = new Caja<>();
caja2.guardar(123);

System.out.println(caja1.obtener());
System.out.println(caja2.obtener());

    }
    
}
