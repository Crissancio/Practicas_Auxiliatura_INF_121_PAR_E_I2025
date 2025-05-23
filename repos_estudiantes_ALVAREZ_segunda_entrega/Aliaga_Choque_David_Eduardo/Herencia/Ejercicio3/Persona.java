import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    public String ci;
    public String nombre;
    public String apellido;
    public String celular;
    public LocalDate fechaNac;

    // b) CImplementa las clases con sus constructores, datos por defecto y mostrar
    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = LocalDate.parse(fechaNac);
    }

    public int getEdad() {
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", CI: " + ci + ", Celular: " + celular + ", Fecha Nac: " + fechaNac;
    }
    
    public static void main(String[] args) {
        
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("123", "Ana", "Lopez", "70012345", "2000-05-12", "RU001", "2019-02-01", "6"));
        estudiantes.add(new Estudiante("124", "Luis", "Perez", "70054321", "1996-08-21", "RU002", "2017-02-01", "10"));
        estudiantes.add(new Estudiante("125", "Maria", "Lopez", "70088888", "2005-10-10", "RU003", "2023-02-01", "2"));

        List<Docente> docentes = new ArrayList<>();
        docentes.add(new Docente("300", "Carlos", "Gomez", "70123456", "1970-03-05", "NIT001", "Ingeniero", "Sistemas", "M"));
        docentes.add(new Docente("301", "Sofia", "Lopez", "70999999", "1980-07-20", "NIT002", "Licenciada", "Matematicas", "F"));
        docentes.add(new Docente("302", "Juan", "Perez", "70222222", "1965-01-15", "NIT003", "Ingeniero", "Electronica", "M"));

        System.out.println("Lista de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }

        System.out.println("\nLista de docentes:");
        for (Docente d : docentes) {
            System.out.println(d);
        }

        // c) Mostrar los estudiantes mayores de 25 años
        System.out.println("\nEstudiantes mayores de 25 años:");
        for (Estudiante e : estudiantes) {
            if (e.getEdad() > 25) {
                System.out.println(e);
            }
        }

        // d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y es el mayor de todos
        Docente mayorIngeniero = null;
        for (Docente d : docentes) {
            if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("M")) {
                if (mayorIngeniero == null || d.getEdad() > mayorIngeniero.getEdad()) {
                    mayorIngeniero = d;
                }
            }
        }

        System.out.println("\nDocente ingeniero masculino mayor:");
        if (mayorIngeniero != null) {
            System.out.println(mayorIngeniero);
        }

        // e) Mostrar a los estudiantes y docentes que tienen el mismo apellido
        System.out.println("\nCoincidencias de apellido entre estudiantes y docentes:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.getApellido().equalsIgnoreCase(d.getApellido())) {
                    System.out.println(e.nombre + " " + e.apellido + " (Estudiante) y " + d.nombre + " " + d.apellido + " (Docente)");
                }
            }
        }
    }
    
}
