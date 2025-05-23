/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagregacion1;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Universidad {
   private String nombre;
   private ArrayList <Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }
    public void agregarEstudiante(Estudiante e) {
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
        for (Estudiante h : estudiantes) {
            h.mostrarInfo();
        }
    }
   
}
