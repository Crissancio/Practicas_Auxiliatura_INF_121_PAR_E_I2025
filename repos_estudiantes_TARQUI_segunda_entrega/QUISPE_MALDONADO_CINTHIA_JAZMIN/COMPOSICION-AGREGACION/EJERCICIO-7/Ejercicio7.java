/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer7agregacion;

/**
 *
 * @author CINTHIA
 */
public class Ejer7agregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1=new Estudiante("Ana Rojas","Ingenieria",3);
        Estudiante e2=new Estudiante("Pedro Quispe","Medicina",6);
        Estudiante e3=new Estudiante("Juan Perez","Fisica",1);
        Estudiante e4=new Estudiante("Luis Luna","Ingenieria",7);
        Estudiante e5=new Estudiante("Fernanda Quiroga","Abogado",4);
        Universidad u1=new Universidad("UNIVERSIDAD MAYOR DE SAN ANDRES");
        u1.agregar_estudiante(e1);
        u1.agregar_estudiante(e2);
        u1.agregar_estudiante(e3);
        u1.agregar_estudiante(e4);
        u1.agregar_estudiante(e5);
        u1.mostrar_universidad();
        
    }
    
}
