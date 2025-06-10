/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgenerecidad1;

/**
 *
 * @author Administrador
 */
public class PGenerecidad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a) Crear dos instancias con diferentes tipos
        Caja<String> cajaT = new Caja<>();
        Caja<Integer> cajaE = new Caja<>();

        // b) Guardar datos en las cajas
        cajaT.guardar("Hello");
        cajaE.guardar(13);

        // c) Mostrar el contenido de las cajas
        System.out.println("Contenido 1 : " + cajaT.obtener());
        System.out.println("Contenido 2 : " + cajaE.obtener());
    }
    
}
