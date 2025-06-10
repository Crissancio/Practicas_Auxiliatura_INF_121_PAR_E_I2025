/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Administrador
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //5. Crea una clase Estudiante con nombre, nota_1, nota_2

//c) Crea tres estudiantes, muestra sus promedios y si aprobaron
        System.out.println("----Estudiante 1----");
        Estudiante e1=new Estudiante("Maria",9.6,7.5);
        e1.mostrar();
        e1.verificar();
        System.out.println("----Estudiante 2----");
        Estudiante e2=new Estudiante("Juan",5.7,3.5);
        e2.mostrar();
        e2.verificar();
        System.out.println("----Estudiante 3----");
        Estudiante e3=new Estudiante("Pedro",6.6,8.5);
        e3.mostrar();
        e3.verificar();
    }
    
}
