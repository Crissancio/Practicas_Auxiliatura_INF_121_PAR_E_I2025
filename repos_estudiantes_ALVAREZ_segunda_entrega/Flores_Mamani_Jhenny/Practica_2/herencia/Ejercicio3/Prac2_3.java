/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

public class Prac2_3 {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("11", "pedro", 2004, "Chambi", "7771", "R11", "12/09/2024", "5");
        Estudiante e2 = new Estudiante("22", "juan", 2000, "Plod", "7772", "P22", "12/09/2024", "5");
 
        System.out.println("------ Estudiante 1 -------");
        e1.mostrar();
        System.out.println("\n------ Estudiante 2 -------");
        e2.mostrar();

        Docente d1 = new Docente("456123", "Mocs", "llol", "79988776", 1987, "NIT321", "fisica", "Femenino");
        Docente d2 = new Docente("67889985", "tito", "Chavez", "67889985", 1991, "NIT322", "ingeniero", "Masculino");

        System.out.println("\n------- Docente 1 --------");
        d1.mostrar();
        System.out.println("\n------- Docente 2 --------");
        d2.mostrar();

        Mayores25(e1);
        Mayores25(e2);
      

        IngenieroMayor(d1);
        IngenieroMayor(d2);

        Apellidos(d1, e1);
        Apellidos(d2, e2);
    }

    public static void Mayores25(Estudiante e) {
        System.out.println("\n¿" + e.getNombre() + " tiene más de 25 años?");
        if (e.calcularEdad() > 25) {
            System.out.println("Sí. Edad: " + e.calcularEdad());
            e.mostrar();
        } else {
            System.out.println("No. Edad: " + e.calcularEdad());
        }
    }

    public static void IngenieroMayor(Docente d) {
        System.out.println("\n  docente ingeniero:");
        if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("Masculino")) {
            System.out.println("Docente encontrado:");
            d.mostrar();
        } else {
            System.out.println("No cumple con los criterios.");
        }
    }

    public static void Apellidos(Docente d, Estudiante e) {
        if (d.getApellido().equalsIgnoreCase(e.getApellido())) {
            System.out.println("\nCoincidencia de apellidos encontrada: " + d.getApellido());
            d.mostrar();
            e.mostrar();
        }
    }
}




