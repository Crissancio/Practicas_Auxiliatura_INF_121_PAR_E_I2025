/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5genericidad;

/**
 *
 * @author CINTHIA
 */
public class Ejercicio5Genericidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila<String> pNo=new Pila<>();
        pNo.apilar("Ana");
        pNo.apilar("Juan");
        pNo.apilar("Rene");
        pNo.mostar();
        System.out.println("Desapilando:   ");
        pNo.desapilat();
        pNo.mostar();
        Pila<Integer> pNu=new Pila<>();
        pNu.apilar(10);
        pNu.apilar(395);
        pNu.apilar(7268);
        pNu.mostar();
        System.out.println("Desapilando:   ");
        pNu.desapilat();
        pNu.mostar();
         Pila<Productos> pP = new Pila<>();
        pP.apilar(new Productos("Cepillo", 256));
        pP.apilar(new Productos("Toalla",264));

        pP.mostar();
        System.out.println("Desapilado: ");
        pP.desapilat();
        pP.mostar();
                
        
    }
    
}
