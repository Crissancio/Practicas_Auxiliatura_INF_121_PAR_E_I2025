package ComposicionAgregacion.Ejer7.codigo;

//7. Crea un POO para una universidad y sus estudiantes. La universidad contiene
//estudiantes, pero los estudiantes pueden existir independientemente de la
//universidad.
//Estudiante< nombre, carrera, semestre>
//Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
//Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
//Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el
//nombre de la universidad y la información de todos los estudiantes)
//a) Implementa las clases con sus constructores, getters y setters.
//b) Crea una universidad y agrega varios estudiantes.
//c) Muestra la información de la universidad y sus estudiantes.


public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];
        Universidad universidad = new Universidad("Universidad Nacional", estudiantes);

        Estudiante estudiante1 = new Estudiante("Juan", "Ingeniería", "Segundo semestre");
        Estudiante estudiante2 = new Estudiante("Maria", "Medicina", "Tercer semestre");
        Estudiante estudiante3 = new Estudiante("Pedro", "Arquitectura", "Primer semestre");
        Estudiante estudiante4 = new Estudiante("Ana", "Derecho", "Cuarto semestre");
        
        universidad.agregar_estudiante(estudiante1);
        universidad.agregar_estudiante(estudiante2);
        universidad.agregar_estudiante(estudiante3);
        universidad.agregar_estudiante(estudiante4);
        
        universidad.mostrar_universidad();
    }
}
