/*3.
Definir las clases:
Persona <ci, nombre, apellido, celular, fecha_Nac>
Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
Docente (heredado de persona) <nit, profesión, especialidad>
a)
Diseñar el diagrama UML de las clases anteriores.
b)
Implementa las clases con sus constructores, datos por defecto y mostrar.
c)
Mostrar los estudiantes mayores de 25 años.
d)
Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y es el mayor de todos.
e)
Mostrar a los estudiantes y docentes que tienen el mismo apellido.*/
package H_2;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();

        Estudiante est1 = new Estudiante("123", "Luis", "Perez", "70000001", new int[]{1995, 5, 1},
                                         "RU001", new int[]{2020, 2, 1}, 9, "Masculino");
        Estudiante est2 = new Estudiante("124", "Ana", "Lopez", "70000002", new int[]{2002, 3, 14},
                                         "RU002", new int[]{2023, 2, 1}, 2, "Femenino");
        Docente doc1 = new Docente("201", "Carlos", "Perez", "71000001", new int[]{1980, 1, 15},
                                   "NIT001", "Ingeniero", "Sistemas", "Masculino");
        Docente doc2 = new Docente("202", "Maria", "Lopez", "71000002", new int[]{1985, 10, 30},
                                   "NIT002", "Arquitecta", "Diseño", "Femenino");

        personas.add(est1);
        personas.add(est2);
        personas.add(doc1);
        personas.add(doc2);

        System.out.println("\n=== Estudiantes mayores de 25 años ===");
        for (Persona p : personas) {
            if (p instanceof Estudiante && p.edad(2025) > 25) {
                p.mostrar();
                System.out.println();
            }
        }

        System.out.println("=== Docente Ingeniero masculino y mayor ===");
        Docente mayor = null;
        for (Persona p : personas) {
            if (p instanceof Docente d &&
                d.getProfesion().equals("Ingeniero") &&
                d.getSexo().equals("Masculino")) {
                if (mayor == null || d.edad(2025) > mayor.edad(2025)) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            mayor.mostrar();
            System.out.println();
        }

        System.out.println("=== Coincidencia de apellidos entre estudiantes y docentes ===");
        for (Persona p1 : personas) {
            if (p1 instanceof Estudiante) {
                for (Persona p2 : personas) {
                    if (p2 instanceof Docente && p1.getApellido().equals(p2.getApellido())) {
                        System.out.println("Apellido compartido: " + p1.getApellido());
                        p1.mostrar();
                        p2.mostrar();
                        System.out.println();
                    }
                }
            }
        }

	}

}
