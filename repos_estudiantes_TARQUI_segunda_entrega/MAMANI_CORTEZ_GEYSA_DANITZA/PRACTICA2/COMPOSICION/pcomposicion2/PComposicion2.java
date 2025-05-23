/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposicion2;

/**
 *
 * @author Administrador
 */
public class PComposicion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // b) Crear un avión y agregar varias partes
        Avion a = new Avion("BOA", "pitre");

        a.agregarParte(new Parte("Motor",2650));
        a.agregarParte(new Parte("Ala izquierda",5000));
        a.agregarParte(new Parte("Ala derecha",5000));
        a.agregarParte(new Parte("llantas",600));
        a.agregarParte(new Parte("Timón ",600));

        // c) Mostrar toda la información
        a.mostrarInfo();
    }
    
}
