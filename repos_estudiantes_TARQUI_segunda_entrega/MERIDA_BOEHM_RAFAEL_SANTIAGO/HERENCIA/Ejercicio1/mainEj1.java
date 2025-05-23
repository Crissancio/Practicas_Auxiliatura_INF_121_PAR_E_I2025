package Ejercicio1_H;
import java.util.ArrayList;
public class mainEj1 {

	 public static void main(String[] args) {
	        ArrayList<Estudiante> estudiantes = new ArrayList<>();
	        estudiantes.add(new Estudiante("123", "Ana", "López", "78945612", "1998-06-15", "RU001", "2020-02-15", 6));
	        estudiantes.add(new Estudiante("456", "Luis", "Gómez", "78945613", "2003-04-20", "RU002", "2022-01-10", 2));
	        estudiantes.add(new Estudiante("789", "Clara", "López", "78945614", "1995-03-10", "RU003", "2018-03-10", 8));

	        ArrayList<Docente> docentes = new ArrayList<>();
	        docentes.add(new Docente("321", "Mario", "López", "78912345", "1980-01-01", "NIT001", "Ingeniero", "Sistemas", "M"));
	        docentes.add(new Docente("654", "Juana", "Gómez", "78912346", "1975-09-10", "NIT002", "Licenciada", "Matemáticas", "F"));

	        System.out.println("Estudiantes mayores de 25 años:");
	        for (Estudiante est : estudiantes) {
	            if (est.calcularEdad() > 25) {
	                est.mostrarInfo();
	                System.out.println();
	            }
	        }

	        System.out.println("Docente Ingeniero, masculino y mayor de todos:");
	        Docente mayorDoc = null;
	        for (Docente doc : docentes) {
	            if (doc.profesion.equals("Ingeniero") && doc.sexo.equals("M")) {
	                if (mayorDoc == null || doc.calcularEdad() > mayorDoc.calcularEdad()) {
	                    mayorDoc = doc;
	                }
	            }
	        }
	        if (mayorDoc != null) {
	            mayorDoc.mostrarInfo();
	            System.out.println();
	        }

	        System.out.println("Estudiantes y docentes con el mismo apellido:");
	        for (Estudiante est : estudiantes) {
	            for (Docente doc : docentes) {
	                if (est.apellido.equals(doc.apellido)) {
	                    est.mostrarInfo();
	                    doc.mostrarInfo();
	                    System.out.println();
	                }
	            }
	        }
	    }
	}