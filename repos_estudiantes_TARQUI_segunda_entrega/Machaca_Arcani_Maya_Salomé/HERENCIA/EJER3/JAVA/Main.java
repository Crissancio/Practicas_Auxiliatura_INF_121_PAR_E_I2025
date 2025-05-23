/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Docente> docentes = new ArrayList<>();

        estudiantes.add(new Estudiante("123", "Ana", "Lopez", "7654321", LocalDate.of(1995, 5, 10),
                "RU123", LocalDate.of(2020, 2, 1), 8));
        estudiantes.add(new Estudiante("456", "Luis", "Gomez", "7890123", LocalDate.of(2006, 3, 20),
                "RU456", LocalDate.of(2024, 3, 1), 1));

        docentes.add(new Docente("789", "Carlos", "Lopez", "1234567", LocalDate.of(1980, 7, 15),
                "NIT001", "Ingeniero", "Sistemas", "Masculino"));
        docentes.add(new Docente("321", "Lucia", "Gomez", "4567890", LocalDate.of(1985, 9, 25),
                "NIT002", "Licenciada", "Matematica", "Femenino"));

        // c) Estudiantes mayores de 25 años
        System.out.println("Estudiantes mayores de 25:");
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                e.mostrar();
                System.out.println();
            }
        }

        // d) Docente con profesión "Ingeniero", sexo masculino y mayor edad
        System.out.println("Docente ingeniero masculino con mayor edad:");
        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("Masculino")) {
                if (mayor == null || d.getEdad() > mayor.getEdad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            mayor.mostrar();
        }

        // e) Estudiantes y docentes con el mismo apellido
        System.out.println("\nCoincidencias de apellido entre estudiantes y docentes:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println("Apellido: " + e.getApellido());
                    System.out.println("Estudiante:");
                    e.mostrar();
                    System.out.println("Docente:");
                    d.mostrar();
                    System.out.println("-----");
                }
            }
        }
    }   
}
