/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac.agre1;

/**
 *
 * @author WINDOWS 11
 */
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Universidad {
   private String nombre;
   private ArrayList <Estdiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estdiante>();
    }
    public void agregarEstdiante(Estdiante e) {
        estudiantes.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void mostrarInfo() {
        System.out.println("Universidad: " + nombre);
        System.out.println("Estudiantes:");
        for (Estdiante h : estudiantes) {
            h.mostrarInfo();
        }
    }
   
}
