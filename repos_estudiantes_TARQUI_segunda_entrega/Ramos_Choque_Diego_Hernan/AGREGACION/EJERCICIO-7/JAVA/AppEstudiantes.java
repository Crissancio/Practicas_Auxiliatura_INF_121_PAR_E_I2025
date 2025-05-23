package Agregacion;

public class AppEstudiantes {
	public  static void main(String[] args) {
		Universidad  u = new Universidad("Universidad Mayor de San Andres (UMSA)");
		Estudiante e1 = new Estudiante("Hernan", "Informatica ", "Segundo Semestre");
		Estudiante e2 = new Estudiante("Sara", "Sociologia ", "Segundo Semestre");
		Estudiante e3 = new Estudiante("Cris", "Informatica ", "Segundo Semestre");
		Estudiante e4 = new Estudiante("Diego", "Matematica ", "Cuarto Semestre");
		u.agregarEstudiante(e1);
		u.agregarEstudiante(e2);
		u.agregarEstudiante(e3);
		u.agregarEstudiante(e4);
		u.mostrar_info();
	}
}
