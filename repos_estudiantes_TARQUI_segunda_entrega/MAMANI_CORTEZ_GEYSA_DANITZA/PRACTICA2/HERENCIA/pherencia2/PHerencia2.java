/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia2;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class PHerencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Estudiante e1=new Estudiante("R11","12/09/2024",5,"11","Rosa","Chavez","7771","1/09/1997","Femenino");
        Estudiante e2=new Estudiante("P22","12/09/2024",5,"22","Paolo","Pilar","7772","15/09/1999","Masculino");
        Estudiante e3=new Estudiante("L33","12/09/2024",5,"33","Lucia","Torrez","77773","20/05/2000","Femenino");
        System.out.println("------Estudiante 1-------");
        e1.mostrarInfo();
        System.out.println("\n ------Estudiante 2-------");
        e2.mostrarInfo();
        System.out.println("\n ------Estudiante 3-------");
        e3.mostrarInfo();
        Docente d1=new Docente("NIT321", "Doctora", "Medicina", "456123", "Maria", "Lopez", "79988776", "12/09/1987", "Femenino");
       
        Docente d2=new Docente("NIT322", "Licenciada", "Lenguas", "456124", "Armando", "Chavez", "67889985", "09/02/1991", "Masculino");
        System.out.println("\n-------Docente 1--------");
        d1.mostrarInfo();
        System.out.println("\n-------Docente 2-------- ");
        d2.mostrarInfo();
        
        //Mayores25(e1);
        IngenieroMayor(d1);
        Apellidos(d1,e1);
    }
    public static void Mayores25(Estudiante e) {
    System.out.println("\nEstudiantes mayores de 25 años:");
        if (e.getEdad() > 25) {
            e.mostrarInfo();
        }else{
            System.out.println("No es mayo a 25 años");
        }
    }
    public static void IngenieroMayor(Docente d) {
    Docente mayor = null;
        if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("Masculino")) {
            if (mayor == null || d.getEdad() > mayor.getEdad()) {
                mayor = d;
            }

    }

    System.out.println("\nDocente Ingeniero Masculino de mayor edad:");
    if (mayor != null) {
        mayor.mostrarInfo();
    } else {
        System.out.println("No se encontró ningún docente que cumpla con los criterios.");
    }
}
    public static void Apellidos(Docente d, Estudiante e) {
    System.out.println("\nEstudiantes y docentes con el mismo apellido:");
            if (e.getApellido().equals(d.getApellido())) {
                System.out.println("Coincidencia encontrada:");
                e.mostrarInfo();
                System.out.println("----------");
                d.mostrarInfo();

            }
    }
    

}

    

