/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1;

/**
 *
 * @author WINDOWS 11
 */

public class Persona{
    String nombre;
    int edad;
    String ciudad;
    Persona(String nombre,int edad,String ciudad){
    this.nombre=nombre;
    this.edad=edad;
    this.ciudad= ciudad;
                                    
    }
    public void  mostrarSaludo ( ) {   
     System.out.println( " holaaaa soy "+ " "+nombre +" "+" de "+" "+ciudad );
        
    }
    public boolean MayorEdad (){
    return edad>=18;}
    
  

}