/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            // b) Implementa las clases con sus constructores, datos por defecto y mostrar.
            System.out.println("--- b) Instancias y Mostrar Información ---");

            Estudiante estudiante1 = new Estudiante("1234567LP", "Juan", "Perez", "70712345", "1998-03-15", "Masculino", "RU-111", "2020-02-10", "Sexto");
            Estudiante estudiante2 = new Estudiante("7654321CB", "Ana", "Lopez", "60698765", "1995-07-22", "Femenino", "RU-222", "2019-08-15", "Octavo");
            Estudiante estudiante3 = new Estudiante("8888888SC", "Carlos", "Vaca", "77755555", "2000-01-30", "Masculino", "RU-333", "2022-02-01", "Cuarto");
            Estudiante estudiante4 = new Estudiante("9999999OR", "Sofia", "Perez", "66644444", "1996-11-05", "Femenino", "RU-444", "2021-02-10", "Septimo");


            Docente docente1 = new Docente("2345678LP", "Maria", "Gonzalez", "70011223", "1980-05-20", "Femenino", "NIT-A1", "Ingeniero", "Sistemas");
            Docente docente2 = new Docente("3456789CB", "Luis", "Martinez", "69022334", "1975-10-10", "Masculino", "NIT-B2", "Arquitecto", "Diseño Urbano");
            Docente docente3 = new Docente("4567890SC", "Pedro", "Chavez", "71733445", "1970-12-01", "Masculino", "NIT-C3", "Ingeniero", "Civil");
            Docente docente4 = new Docente("5678901LP", "Laura", "Ramirez", "72744556", "1985-02-25", "Femenino", "NIT-D4", "Licenciado", "Psicologia");
            Docente docente5 = new Docente("6789012OR", "Mario", "Soto", "73755667", "1965-07-15", "Masculino", "NIT-E5", "Ingeniero", "Industrial");

            System.out.println("Estudiantes:");
            System.out.println("E1: " + estudiante1.mostrar());
            System.out.println("E2: " + estudiante2.mostrar());
            System.out.println("E3: " + estudiante3.mostrar());
            System.out.println("E4: " + estudiante4.mostrar());

            System.out.println("\nDocentes:");
            System.out.println("D1: " + docente1.mostrar());
            System.out.println("D2: " + docente2.mostrar());
            System.out.println("D3: " + docente3.mostrar());
            System.out.println("D4: " + docente4.mostrar());
            System.out.println("D5: " + docente5.mostrar());

            List<Estudiante> listaEstudiantes = new ArrayList<>();
            listaEstudiantes.add(estudiante1);
            listaEstudiantes.add(estudiante2);
            listaEstudiantes.add(estudiante3);
            listaEstudiantes.add(estudiante4);

            List<Docente> listaDocentes = new ArrayList<>();
            listaDocentes.add(docente1);
            listaDocentes.add(docente2);
            listaDocentes.add(docente3);
            listaDocentes.add(docente4);
            listaDocentes.add(docente5);
            
            List<Persona> todasLasPersonas = new ArrayList<>();
            todasLasPersonas.addAll(listaEstudiantes);
            todasLasPersonas.addAll(listaDocentes);

            // c) Mostrar los estudiantes mayores de 25 años.
            System.out.println("\n--- c) Estudiantes mayores de 25 años ---");
            List<Estudiante> estudiantesMayores25 = listaEstudiantes.stream()
                    .filter(e -> e.getEdad() > 25)
                    .collect(Collectors.toList());

            if (!estudiantesMayores25.isEmpty()) {
                for (Estudiante e : estudiantesMayores25) {
                    System.out.println(e.mostrar());
                }
            } else {
                System.out.println("No hay estudiantes mayores de 25 años.");
            }

            // d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y es el mayor de todos.
            System.out.println("\n--- d) Docente Ingeniero, Masculino y Mayor ---");
            Docente docenteMayorIngeniero = null;
            int edadMaxIngMasculino = -1;

            for (Docente d : listaDocentes) {
                if ("Ingeniero".equalsIgnoreCase(d.getProfesion()) && "Masculino".equalsIgnoreCase(d.getSexo())) {
                    if (d.getEdad() > edadMaxIngMasculino) {
                        edadMaxIngMasculino = d.getEdad();
                        docenteMayorIngeniero = d;
                    }
                }
            }

            if (docenteMayorIngeniero != null) {
                System.out.println(docenteMayorIngeniero.mostrar());
            } else {
                System.out.println("No se encontró ningún docente Ingeniero masculino.");
            }
            
            // e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.
            System.out.println("\n--- e) Personas con el mismo apellido ---");
            Map<String, List<Persona>> personasPorApellido = new HashMap<>();
            for (Persona p : todasLasPersonas) {
                personasPorApellido.computeIfAbsent(p.getApellido(), k -> new ArrayList<>()).add(p);
            }

            boolean personasMismoApellidoEncontradas = false;
            for (Map.Entry<String, List<Persona>> entry : personasPorApellido.entrySet()) {
                if (entry.getValue().size() > 1) {
                    if (!personasMismoApellidoEncontradas) {
                         System.out.println("Personas que comparten apellido:");
                    }
                    System.out.println("\nApellido: " + entry.getKey());
                    for (Persona p : entry.getValue()) {
                        System.out.println(p.mostrar());
                    }
                    personasMismoApellidoEncontradas = true;
                }
            }
            if (!personasMismoApellidoEncontradas) {
                 System.out.println("No se encontraron estudiantes ni docentes que compartan apellido.");
            }

        } catch (IllegalArgumentException iae) {
            System.err.println("Error de datos al crear objeto: " + iae.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}