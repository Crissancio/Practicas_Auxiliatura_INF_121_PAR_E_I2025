/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5genericidad;

import java.util.ArrayList;

/**
 *
 * @author CINTHIA
 */
public class Pila<T>{
    private ArrayList<T> elementos;
    public Pila(){
        elementos=new ArrayList<>();
    }
    public void apilar(T elemento){
        elementos.add(elemento);
    }
   public boolean estaVacia(){
       return elementos.isEmpty();
   }
   public T desapilat(){
       if(!estaVacia()){
           return elementos.remove(elementos.size()-1);
       }
       else{
           System.out.println("PILA VACIA");
           return null;
       }
   }
   public void mostar(){
       System.out.println("PILA: ");
       for(int i=elementos.size()-1;i>=0;i--){
           System.out.println("    "+elementos.get(i));
       }
   }
}
