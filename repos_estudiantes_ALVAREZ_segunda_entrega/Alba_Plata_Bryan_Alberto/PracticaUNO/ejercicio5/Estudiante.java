/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaacinco;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String nombre;
    private int nota_1;
    private int nota_2;
    public Estudiante(String nombre, int nota_1, int nota_2){
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota_1() {
        return nota_1;
    }

    public void setNota_1(int nota_1) {
        this.nota_1 = nota_1;
    }

    public int getNota_2() {
        return nota_2;
    }

    public void setNota_2(int nota_2) {
        this.nota_2 = nota_2;
    }
    public int  Promedio(){
         return (nota_1 + nota_2)/2;
    }
    public String  Calificacion(){
        String nota;
        if (Promedio() >= 6){
           nota = "aprobo";
        }else{
           nota = "reprobo";
        } 
        
        return (nota);
    }
    public String toString(){
        return ("Estudiante: "+ nombre + ", Promedio: "+ Promedio()+", "+ Calificacion());
    } 
}
