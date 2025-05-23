import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Estudiante estudiante = new Estudiante("12345678", "Juan", "Perez", 77777777, 2000, "20200000", "01/01/2020", 1);
    Estudiante estudiante2 = new Estudiante("87654321", "Luz", "Gonzalez", 66666666, 1980, "2020000,1", "01/01/2020", 1);
    Docente docente = new Docente("87654321", "Melissa", "Limachi", 66666666, 1980, 1234567, "Ingeniero", "nose");
    Docente docente2 = new Docente("87654321", "Maria", "Gonzalez", 66666666, 1980, 123456, "Doctor", "nose");

    ArrayList<Persona> personas = new ArrayList<>();

    personas.add(estudiante);
    personas.add(estudiante2);
    personas.add(docente);
    personas.add(docente2);

    mostrarEstudiantesMayoresDe25(personas);
    System.out.println("--------------------------------------------------------------\n");
    mostrarDocenteIngenieroDeMayorEdad(personas);
    System.out.println("--------------------------------------------------------------\n");
    mostrarEstudianteYDocenteConElMismoApellido(personas);
  }

  //////////////////////////////////    Funtions   ///////////////////////////////////////

  public static void mostrarEstudiantesMayoresDe25(ArrayList<Persona> personas) {
    for (Persona persona : personas) {
      if (persona instanceof Estudiante && persona.getEdad() > 25) {
        System.out.println("Estudiantes mayores de 25 años:\n");
        persona.mostrarDatos();
      }
    }
  }

  public static void mostrarDocenteIngenieroDeMayorEdad(ArrayList<Persona> personas) {
    Docente ingenieroMayor = null;
    for (Persona persona : personas) {
      if (persona instanceof Docente && ((Docente) persona).getProfesion().equals("Ingeniero")) {
        if (ingenieroMayor == null || persona.getEdad() > ingenieroMayor.getEdad()) {
          ingenieroMayor = (Docente) persona;
        }
      }
    }
    if (ingenieroMayor != null) {
      System.out.println("Docente Ingeniero de mayor edad:\n");
      ingenieroMayor.mostrarDatos();
    } else {
      System.out.println("No hay docentes Ingenieros");
    }
  }

  public static void mostrarEstudianteYDocenteConElMismoApellido(ArrayList<Persona> personas) {
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    ArrayList<Docente> docentes = new ArrayList<>();
    for (Persona p : personas) {
      if (p instanceof Estudiante) {
        estudiantes.add((Estudiante) p);
      } else if (p instanceof Docente) {
        docentes.add((Docente) p);
      }
    }

    for (Estudiante e : estudiantes) {
      for (Docente d : docentes) {
        if (e.getApellido().equals(d.getApellido())) {
          System.out.println("Estudiante y Docente con el mismo apellido:\n");
          e.mostrarDatos();
          System.out.println("");
          d.mostrarDatos();
        }
      }
    }
  }
}