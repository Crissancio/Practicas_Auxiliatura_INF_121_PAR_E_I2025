/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gener5;

/**
 *
 * @author WINDOWS 11
 */
public class Libro {
    
    String titulo;
   

    public Libro(String titulo) {
        this.titulo = titulo;
       
    }

    @Override
    public String toString() {
        return "Libro: " + titulo;
    }
}

