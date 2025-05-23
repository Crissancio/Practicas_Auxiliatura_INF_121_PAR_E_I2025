/*

 * ------------------EJERCICIO 3------------------
 * 
 Definir las clases:

Persona &lt;ci, nombre, apellido, celular, fecha_Nac&gt;
Estudiante (heredado de persona) &lt;ru, fecha_Ingreso, semestre&gt;
Docente (heredado de persona) &lt;nit, profesión, especialidad&gt;
a) Diseñar el diagrama UML de las clases anteriores.
b) Implementa las clases con sus constructores, datos por defecto y
mostrar.
c) Mostrar los estudiantes mayores de 25 años.
d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo
masculino y es el mayor de todos.
e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.
 */


public class Main {
    public static void main(String[] args) {
        //B)
        Estudiante est1 = new Estudiante("123456", "Juan", "Perez", "7654321", "01/01/1998", "EST001", "01/01/2020", 5);
        Estudiante est2 = new Estudiante("789012", "Maria", "Gomez", "6543210", "15/05/2000", "EST002", "01/01/2022", 3);
        Docente doc1 = new Docente("345678", "Jose", "Lopez", "5432109", "10/10/1985", "NIT001", "Ingeniero", "Sistemas");
        Docente doc2 = new Docente("901234", "Ana", "Martinez", "4321098", "20/03/1990", "NIT002", "Médico", "Cardiología");

        //B)
        System.out.println("Información de las personas:");
        est1.mostrar();
        System.out.println();
        est2.mostrar();
        System.out.println();
        doc1.mostrar();
        System.out.println();
        doc2.mostrar();
        System.out.println();

        //C)
        System.out.println("Estudiantes mayores de 25 años:");
        Persona[] personas = {est1, est2, doc1, doc2};
        for (Persona persona : personas) {
            if (persona instanceof Estudiante && persona.calcularEdad() > 25) {
                persona.mostrar();
                System.out.println();
            }
        }

        //D)
        System.out.println("Docente Ingeniero, masculino y mayor:");
        int maxEdad = -1;
        Docente docenteMayor = null;
        for (Persona persona : personas) {
            if (persona instanceof Docente) {
                Docente docente = (Docente) persona;
                int edad = persona.calcularEdad();
                if (docente.getProfesión().equals("Ingeniero") && docente.getSexo().equals("Masculino") && edad > maxEdad) {
                    maxEdad = edad;
                    docenteMayor = docente;
                }
            }
        }
        if (docenteMayor != null) {
            docenteMayor.mostrar();
            System.out.println();
        }

        //E)
        System.out.println("Estudiantes y docentes con el mismo apellido:");
        for (int i = 0; i < personas.length; i++) {
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[i].getApellido().equals(personas[j].getApellido())) {
                    personas[i].mostrar();
                    System.out.println(" coincide con:");
                    personas[j].mostrar();
                    System.out.println();
                }
            }
        }
    }
}