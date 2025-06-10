/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3genericidad;

import java.util.ArrayList;

/**
 *
 * @author CINTHIA
 */
public class Catalogo<T> {
    private ArrayList<T> objeto;
    public Catalogo(){
        this.objeto=new ArrayList<>();
    }
    public void agregar(T obj){
        objeto.add(obj);
    }
    public void buscar(T obj){
        if(objeto.contains(obj)){
            System.out.println("    SI");
        }
        else{
            System.out.println("    No");
        }
    }
    public void mostrar(){
        System.out.println("Catalogo");
        for(int i=0;i<objeto.size();i++){
            System.out.println("    -"+objeto.get(i).toString());
        }
    }
}
