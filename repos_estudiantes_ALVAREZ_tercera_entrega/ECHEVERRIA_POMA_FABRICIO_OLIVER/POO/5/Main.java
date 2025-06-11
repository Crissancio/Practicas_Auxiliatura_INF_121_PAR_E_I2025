/*
---------------ENUNCIADO-----------------

 *5. Crea una clase Estudiante con nombre, nota_1, nota_2
a) Agrega un método para calcular el promedio
b) Agrega un método para verificar si aprobó (promedio >=6)
c) Crea tres estudiantes, muestra sus promedios y si aprobaron */

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Luisito", 7.7, 7.0);
        Estudiante estudiante2 = new Estudiante("Delgadillo", 1.0, 9.0);

        System.out.println("Promedio y Estado");
        System.out.println("Estudiante: " + estudiante1.nombre );
        System.out.println("Promedio: " + estudiante1.promedio());
        System.out.println("Aprobo? " + (estudiante1.aprobacion() ? "Si" : "No"));

        System.out.println("Estudiante: " + estudiante2.nombre );
        System.out.println("Promedio: " + estudiante2.promedio());
        System.out.println("Aprobo? " + (estudiante2.aprobacion() ? "Si" : "No"));
    }
    
}
