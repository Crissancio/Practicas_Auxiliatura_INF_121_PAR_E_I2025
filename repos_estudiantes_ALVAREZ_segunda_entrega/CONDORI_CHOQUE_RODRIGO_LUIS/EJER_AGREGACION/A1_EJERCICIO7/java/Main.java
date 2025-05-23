/*7.
Crea un POO para una universidad y sus estudiantes. La universidad contiene estudiantes, 
pero los estudiantes pueden existir independientemente de la universidad.
Estudiante< nombre, carrera, semestre>
Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el nombre de la universidad 
y la información de todos los estudiantes)
a)
Implementa las clases con sus constructores, getters y setters.
b)
Crea una universidad y agrega varios estudiantes.
c)
Muestra la información de la universidad y sus estudiantes.*/

package A_1;

public class Main {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Ana", "Ingeniería", 3);
        Estudiante e2 = new Estudiante("Luis", "Derecho", 5);
        Estudiante e3 = new Estudiante("María", "Arquitectura", 2);

        Universidad uni = new Universidad("Universidad Nacional");
        uni.agregarEstudiante(e1);
        uni.agregarEstudiante(e2);
        uni.agregarEstudiante(e3);

        uni.mostrarUniversidad();
	}

}
