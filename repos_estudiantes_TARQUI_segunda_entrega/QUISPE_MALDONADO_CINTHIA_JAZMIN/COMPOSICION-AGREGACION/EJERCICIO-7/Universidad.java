/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7agregacion;

import java.util.ArrayList;

/**
 *
 * @author CINTHIA
 */
public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    public Universidad(String nombre){
        this.nombre=nombre;
        this.estudiantes=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void agregar_estudiante(Estudiante e){
        estudiantes.add(e);
    }
    public void mostrar_universidad(){
        System.out.println("Universidad: "+nombre);
        System.out.println("Lista de estudiantes: ");
        for(int i=0;i<estudiantes.size();i++){
            estudiantes.get(i).mostrar();
        }
    }
}
