/*
7. Crea un POO para una universidad y sus estudiantes. La universidad contiene 
estudiantes, pero los estudiantes pueden existir independientemente de la 
universidad.
Estudiante< nombre, carrera, semestre>
Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el 
nombre de la universidad y la información de todos los estudiantes)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una universidad y agrega varios estudiantes.
c) Muestra la información de la universidad y sus estudiantes.
 */
public class Main {
    public static void main(String[] args) {
        // b) 
        Universidad u = new Universidad("Universidad Mayor de San Andres (UMSA)");
        // b) creando estudiantes 
        Estudiante est1 = new Estudiante("Adrian Apaza", "Informática", 3);
        Estudiante est2 = new Estudiante("Mayerly flores", "Informatica", 5);
        Estudiante est3 = new Estudiante("Ariel Arteaga", "Informatica", 2);
        Estudiante est4 = new Estudiante("Angel Manuel", "Gastronomía", 4);
        // b)  agregando estudiantes a la U
        u.agregar_estudiante(est1);
        u.agregar_estudiante(est2);
        u.agregar_estudiante(est4);
        // c) mostrando la universidad y sus estudiantes
        u.mostrar_universidad();
        System.out.println("_______________________________");
        // descartamos la clase Universidad pero al clase estudiante sigue funcionando
        System.out.println("Estudiante: ");
           est3.mostrar_info();
    }
}