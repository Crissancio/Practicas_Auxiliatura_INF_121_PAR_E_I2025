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
public class Estudiante {
    private String nombre;
    private double nota_1, nota_2;

    public Estudiante(String nombre, double nota_1, double nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }
    //a) Agrega un método para calcular el promedio
    public double promedio(){
        return (nota_1+nota_2)/2;
    }
    //b) Agrega un método para verificar si aprobó (promedio &gt;=6)
    public void verificar(){
      if(promedio()>=6){
          System.out.println("Aprobo");
      }else{
          System.out.println("Reprobo");
      }
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Promedio: "+promedio());
        
    }
}
