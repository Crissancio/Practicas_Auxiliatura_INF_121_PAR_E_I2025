/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapersona;

/**
 *
 * @author Renzo
 */
public class Principal {
    public static void main(String[] args) {
        int anioActual = 2025;

        Estudiante[] estudiantes = new Estudiante[2];
        estudiantes[0] = new Estudiante("123", "Renzo", "Espinoza", "789456", 1997, "RU001", 2020, 8);
        estudiantes[1] = new Estudiante("456", "Ana", "Lopez", "789000", 2006, "RU002", 2023, 2);

        Docente[] docentes = new Docente[2];
        docentes[0] = new Docente("111", "Carlos", "Espinoza", "745896", 1975, "NIT001", "Ingeniero", "Sistemas", "masculino");
        docentes[1] = new Docente("222", "Laura", "Paredes", "788899", 1980, "NIT002", "Licenciada", "Matemáticas", "femenino");

        // Estudiantes mayores de 25
        System.out.println("\n=== Estudiantes mayores de 25 años ===");
        for (Estudiante est : estudiantes) {
            if (est.getEdad(anioActual) > 25) {
                est.mostrar();
            }
        }

        // Docente ingeniero, masculino y mayor
        Docente mayor = null;
        for (Docente doc : docentes) {
            if (doc.getProfesion().equalsIgnoreCase("Ingeniero") &&
                doc.getSexo().equalsIgnoreCase("masculino")) {
                if (mayor == null || doc.getEdad(anioActual) > mayor.getEdad(anioActual)) {
                    mayor = doc;
                }
            }
        }
        if (mayor != null) {
            System.out.println("\n=== Docente ingeniero masculino y mayor ===");
            mayor.mostrar();
        }

        // Coincidencia de apellidos
        System.out.println("\n=== Coincidencia de apellido entre estudiantes y docentes ===");
        for (Estudiante est : estudiantes) {
            for (Docente doc : docentes) {
                if (est.getApellido().equalsIgnoreCase(doc.getApellido())) {
                    est.mostrar();
                    doc.mostrar();
                }
            }
        }
    }
}
