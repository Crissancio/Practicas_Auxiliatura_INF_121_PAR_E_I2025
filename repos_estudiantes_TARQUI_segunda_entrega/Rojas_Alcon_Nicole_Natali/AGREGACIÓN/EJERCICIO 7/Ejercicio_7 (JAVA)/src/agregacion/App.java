package agregacion;

public class App {
	public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Natali Rojas", "Informática", 2);
        Estudiante est2 = new Estudiante("Cecilia López", "Informática", 1);
        Estudiante est3 = new Estudiante("Marcelo Portillo", "Informática", 3);

        Universidad umsa = new Universidad("Universidad Mayor de San Andrés");

        umsa.agregarEstudiante(est1);
        umsa.agregarEstudiante(est2);
        umsa.agregarEstudiante(est3);

        umsa.mostrarUniversidad();
    }
}
